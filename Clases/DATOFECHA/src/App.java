import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha);

        System.out.println(fecha.getYear());
        System.out.println(fecha.getMonthValue());
        System.out.println(fecha.getDayOfMonth());
        System.out.println(fecha.getHour());
        System.out.println(fecha.getMinute());
        System.out.println(fecha.getSecond());
    }
}
