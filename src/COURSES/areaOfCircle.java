package COURSES;
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a Circle : ");
        float A = sc.nextFloat();
        float B = A * A;
        double C = 3.14 * B ;

        sc.close();
        System.out.println("The area of the Circle is : " + C);
    }
}
