package BTech;
// import java.sql.SQLOutput;
import java.util.Scanner;
public class threeLinesOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String st = sc.nextLine();
        System.out.println("String: " + st);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        sc.close();
//        System.out.println(" "*5+'k');
    }
}
