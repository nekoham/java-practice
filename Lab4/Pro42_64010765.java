package Lab4;

import java.util.GregorianCalendar;

public class Pro42_64010765 {
    public static void main(String[] args) {
        // Creating calendar object
        GregorianCalendar calendar = new GregorianCalendar();

        // Printing out current calendar
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");

        // Elapse time one day into the future and print them out
        calendar.setTimeInMillis(86400000 + calendar.getTimeInMillis());

        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(calendar.getTime());
    }
}
