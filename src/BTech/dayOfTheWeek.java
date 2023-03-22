package BTech;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
public class dayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        System.out.println(time);
        System.out.print("Enter Your Date in format (DD MM YYYY): ");
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.print("Your Day is: ");
        LocalDate day = LocalDate.of(year, month, date);
        String daydate = day.getDayOfWeek().toString();
        System.out.println(daydate);
        sc.close();
    }
}
