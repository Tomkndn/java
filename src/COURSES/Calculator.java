package COURSES;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the First number :  ");
        float B = A.nextFloat();
        System.out.print("Enter the Second number :  ");
        float C = A.nextFloat();
        System.out.print("Enter the Operation for the number :  ");
        char D = A.next().charAt(0);

        double P = B + C ;
        double Q = B - C ;
        double R = B * C ;
        double S = B / C ;
        if ( D == '+'){
            System.out.print("The Answer is " + P );
        }else if( D == '-'){
            System.out.print("The Answer is " + Q );
        }else if(D == '*'){
            System.out.print("The Answer is " + R );
        }else if(D == '/'){
            System.out.print("The Answer is " + S );
        }else{
            System.out.print("Operation is invalid");
        }
        A.close();

    }
}
