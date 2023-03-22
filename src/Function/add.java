package Function;

import java.util.Scanner;

public class add{
    public static double sum(float B, float C){
        float SUM = B+C;
        System.out.println("Sum of the Two Numbers is "+SUM);
        return SUM;
    }
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        float b = A.nextFloat();
        System.out.print("Enter the Second number : ");
        float c = A.nextFloat();
        sum(b,c);
//        System.out.println(SUM);
        A.close();



    }
}
