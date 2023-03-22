package Function;
import java.util.Scanner;
public class basic {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String B = A.next();
        printName(B);
        A.close();
    }
}
