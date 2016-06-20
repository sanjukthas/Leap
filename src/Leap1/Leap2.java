package Leap1;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Leap2 {

	public static void main(String[] args) {
		
		System.out.println(Leap1.displayCalendar(15, 1947));
		System.out.println(Leap1.getDaysInMonth(8, 2015));
		System.out.println(Leap1.isLeapYear(2016));
		System.out.println(Leap1.toString(8, 10, 2020, '/'));
		System.out.println(Leap1.daysBwDates(1, 25, 2015, 1, 31, 2016));
  }
	}