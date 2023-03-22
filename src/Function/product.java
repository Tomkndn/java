package Function;

import java.util.Scanner;

public class product {
    public static float multiply(float B, float C){
        float MUL = B*C;
        return MUL;
    }
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        float b = A.nextFloat();
        System.out.print("Enter the Second number : ");
        float c = A.nextFloat();
        float PLY = multiply(b, c);
        System.out.println("Product of the Two Numbers is "+PLY);
        A.close();
    }
}
