package Function;
import java.util.Scanner;
public class sumOfOddNumbers {
    public static int ODD(int B){
        int R = 0;
        for(int M=1;M<=B;M++){
            if(M%2==0){
            }else{
                R = R + M;
            }
        }
        System.out.print("Sum of Odd numbers is :  "+R);
        return R;

    }
    public static void main (String[]args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the n number for the summation:  ");
        int B = A.nextInt();
        ODD(B);
        A.close();
    }
}
