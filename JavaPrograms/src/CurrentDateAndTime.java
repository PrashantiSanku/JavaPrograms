import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDateAndTime {

	public static void main(String[] args) {
		
		int day, month, year;
		int hour, minute, second;
		
	GregorianCalendar date = new GregorianCalendar();
	//	Calendars date = new Calendars();
		
		day= date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		
		hour = date.get(Calendar.HOUR);
		minute = date.get(Calendar.MINUTE);
		second = date.get(Calendar.SECOND);
		
		System.out.println("The Current Date is : " +day+ "/" + (month+1) +"/"  + year);
		System.out.println("The Current Time is : " + hour+":" + minute + ":" +second);

	}

}
