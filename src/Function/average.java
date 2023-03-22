package Function;
import java.util.Scanner;

public class average {
    public static double avg (float A,float B,float C){
        float SUM = A+B+C;
        double AVG = SUM/3;
        System.out.println("Average of the Three number is:  "+AVG);
        return AVG;
    }
    public static void main(String[] args){
        Scanner P = new Scanner(System.in);
        System.out.print("Enter your First number:   ");
        float Q = P.nextFloat();
        System.out.print("Enter your Second number:   ");
        float R = P.nextFloat();
        System.out.print("Enter your Third number:   ");
        float S = P.nextFloat();
        avg(Q,R,S);
        P.close();
    }
}
