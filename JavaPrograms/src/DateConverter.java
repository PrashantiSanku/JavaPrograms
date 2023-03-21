import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	public static void main(String[] args) {
		String inputDate = "31/01/2022";
        DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat outputFormat = new SimpleDateFormat("d'st' MMM yyyy");
        try {
            Date date = inputFormat.parse(inputDate);
            String outputDate = outputFormat.format(date);
            System.out.println(outputDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}


/* input - 31/01/2022   output - 31st jan 2022  can someone help me writing a logic for this one?!
in java*/

