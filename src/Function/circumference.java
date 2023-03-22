package Function;
import java.util.Scanner;
public class circumference {
    public static void main(String [] args){
        Scanner A = new Scanner (System.in);
        System.out.print("Enter the radius of the circle :  ");
        double B = A.nextDouble();
        radius(B);
        A.close();

    }
    static double radius(double A) {
        double result = 2*3.14*A;
        System.out.println("Circumference of the circle is :  "+result);
        return result;
    }
}
