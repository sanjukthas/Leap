package Leap1;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Leap1 {
	

	public static String displayCalendar(int month, int year) {
		Calendar cal = new GregorianCalendar();

		cal.clear();
		cal.set(year, month - 1, 1);
		System.out.println(
				"\n" + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US) + " " + cal.get(Calendar.YEAR));

		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		return printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}

	private static String printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {
		String output = "";
		int weekdayIndex = 0;
		output += ("Su  Mo  Tu  We  Th  Fr  Sa\n");
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			output += ("    ");
			weekdayIndex++;
		}
		for (int day = 1; day <= numberOfMonthDays; day++) {
			if (day < 10)
				output += (" " + day);
			else
				output += (day);

			weekdayIndex++;
			if (weekdayIndex == 7) {
				weekdayIndex = 0;
				output += "\n";
			} else {
				output += ("  ");
			}
		}

		output += "\n";
		return output;
	}

	public static int getDaysInMonth(int month, int year) {
		Calendar cal = new GregorianCalendar();
				cal.clear();
		cal.set(year, month - 1, 1);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
			}
	
	public static String toString(int month, int day, int year, char del) {
		return month+""+del+day+del+year;
	}

	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

		
	public static  int daysBwDates(int month, int day, int year, int month1, int day1, int year1) {
		Calendar cal1 = new GregorianCalendar(year,month,day);
		Calendar cal2 = new GregorianCalendar(year1,month1,day1);
		int day11=0;
		day11=daysBetween(cal1.getTime(),cal2.getTime());
		return day11;
		
			}
	public static int daysBetween (Date date1,Date date2){
		 return (int)((date2.getTime()-date1.getTime())/ (1000*60*60*24));
		}
}