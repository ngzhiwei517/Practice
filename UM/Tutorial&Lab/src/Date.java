import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
/*        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime=localDateTime.format(dateTimeFormatter);
        System.out.println(formatDateTime);*/

        System.out.println("Hello woooor"); //this is my change
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Time now:" + localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
        String formatTime = localDateTime.format(formatter);
        System.out.println(formatTime);
    }
}
