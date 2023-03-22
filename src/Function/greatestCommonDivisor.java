package Function;
import java.util.Scanner;
public class greatestCommonDivisor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:  ");
        int A = sc.nextInt();
        System.out.print("Enter the second number: ");
        int B = sc.nextInt();
        GREATEST(A,B);
        sc.close();
    }
    static int GREATEST(int n1,int n2){
        while(n1 != n2) {
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.print("GCD is : "+ n2);
        return n2;
    }
}