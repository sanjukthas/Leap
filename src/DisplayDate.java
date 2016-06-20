
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class DisplayDate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the month number");
		int month = in.nextInt(); 
		System.out.println("Please enter the year");
		int year = in.nextInt(); 



		in.close();

			printCalendarMonthYear(month, year);

	}


	private static void printCalendarMonthYear(int month, int year) {
		
		Calendar cal = new GregorianCalendar();

		cal.clear();
		cal.set(year, month - 1, 1);
		System.out.println("\n"	+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG,Locale.US)
				+ " " + cal.get(Calendar.YEAR));

		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}


	private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {

		int weekdayIndex = 0;
		System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			System.out.print("    ");
			weekdayIndex++;
		}
		for (int day = 1; day <= numberOfMonthDays; day++) {
			System.out.printf("%2d",day);

			weekdayIndex++;
			if (weekdayIndex == 7) {
				weekdayIndex = 0;
				System.out.println();
			} else { 
				System.out.print("  ");
			}
		}

		System.out.println();
	}

}