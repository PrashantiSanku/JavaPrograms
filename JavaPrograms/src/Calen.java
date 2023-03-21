import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calen {
	
	public static String formatDate(String inputDate) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat outputFormat = new SimpleDateFormat("d'st' MMM yyyy");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputFormat.parse(inputDate));
            return outputFormat.format(calendar.getTime()).toLowerCase();
        } catch (Exception e) {
            return "Invalid date";
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(formatDate("31/01/2022"));
	}

}

/* input - 31/01/2022   output - 31st jan 2022  can someone help me writing a logic for this one?!
in java*/
