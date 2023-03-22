package Function;

import java.util.Scanner;

public class factorial {
    public static int FACT(int P){
        if (P < 0){
            System.out.println("invalid number");
            return P;
        }
        int OR = 1;
        for(int i = P;i>=1;i--) {
            OR = OR * i;
        }
        System.out.println("Factorial is  "+OR);
        return OR;
    }

    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the number for the factorial : ");
        int b = A.nextInt();
        FACT(b);
        A.close();

    }
}
