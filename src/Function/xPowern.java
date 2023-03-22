package Function;
import java.util.Scanner;
public class xPowern {
    public static void main(String args[]) {
        System.out.print("Enter x:  ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter n:  ");
        int n = sc.nextInt();
        power(x,n);
        sc.close();

//Please see that n is not too large or else result will exceed the size of int


    }
    static double power(double A,double B){
        double result = 1;
        for(int i=1; i<=B; i++) {
            result = result * A;
        }
        System.out.print("x to the power n is : "+ result);
        return result;
    }

}
