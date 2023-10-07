package omkar;
import java.util.*;
public class linearNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input = sc.nextInt();
        printnum(input);
        sc.close();
    }
    static void printnum(int input){
        if (input!=0) {
            System.out.print(input);
            input--;
            printnum(input);
        }
    }
}
