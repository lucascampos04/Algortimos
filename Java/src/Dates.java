import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Dates {
    public static void main(String[] args) {
        Date currentDate = new Date();

        String timeZoneID1 = "America/New_York";
        String timeZoneID2 = "Europe/London";
        String timeZoneID3 = "America/Sao_Paulo";

        TimeZone timeZone1 = TimeZone.getTimeZone(timeZoneID1);
        TimeZone timeZone2 = TimeZone.getTimeZone(timeZoneID2);
        TimeZone timeZone3 = TimeZone.getTimeZone(timeZoneID3);

        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM d, yyyy HH:mm:ss z");
        sdf1.setTimeZone(timeZone1);
        String formattedDate1 = sdf1.format(currentDate);

        SimpleDateFormat sdf2 = new SimpleDateFormat("EEE, MMM d, yyyy HH:mm:ss z");
        sdf2.setTimeZone(timeZone2);
        String formattedDate2 = sdf2.format(currentDate);

        SimpleDateFormat sdf3 = new SimpleDateFormat("EEE, MMM d, yyyy HH:mm:ss z");
        sdf3.setTimeZone(timeZone3);
        String formattedDate3 = sdf3.format(currentDate);


        System.out.println("Data no fuso horário " + timeZoneID1 + ": " + formattedDate1);
        System.out.println("Data no fuso horário " + timeZoneID2 + ": " + formattedDate2);
        System.out.println("Data no fuso horário " + timeZoneID3 + ": " + formattedDate3);
    }
}
