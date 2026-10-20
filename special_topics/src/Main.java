import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//
//        LocalDate localdate = LocalDate.now();
//        System.out.println(localdate);
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        LocalDateTime horaAtual = LocalDateTime.now();
        System.out.println(horaAtual);
        DateTimeFormatter minhaFormatacao = DateTimeFormatter.ofPattern("dd MM yyyy E HH:mm:ss");
        System.out.println(horaAtual.format(minhaFormatacao));


    }
}
