package Function;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:  ");
        int n = sc.nextInt();
        fib(n);
        sc.close();

//find nth term

//the concept below is called swapping


    }

    static int fib(int A) {

        int a = 0, b = 1;
        System.out.print(a + " ");
        if (A > 1) {
            for (int i = 2; i <= A; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;

//                System.out.println();
            }
        }
        return a ;
    }
}