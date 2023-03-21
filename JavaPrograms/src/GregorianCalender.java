import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalender {

	public static void main(String[] args) {
		
		
		// Java Program to show that Calendar class with
				// default instantiation and GregorianCalendar class
				// with default constructor is basically the same as both
				// return the Gregorian Calendar for the default
				// date, time, time zone and locale
				
				
				// Creating an object of Calendar Class
				Calendar cal = Calendar.getInstance();
				
				/* Displaying Current Date using
		        Calendar Class */
				System.out.println("Calendar date : " +cal.getTime());
				
				/* Creating an object of
		        GregorianCalendar Class */
				GregorianCalendar gcal = new GregorianCalendar();
				
				/* Displaying Current Date using
		        GregorianCalendar Class */
				System.out.println("GregorianCalendar date : " + gcal.getTime());

	}

}
