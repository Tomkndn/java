package omkar;
import java.util.*;
public class linear1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input = sc.nextInt();
        int starter = 1;
        printnum(input,starter);
        sc.close();
    }
    static void printnum(int input, int starter){
        if (starter<=input) {
            System.out.print(starter);
            starter++;
            printnum(input,starter);
        }
    }
}
