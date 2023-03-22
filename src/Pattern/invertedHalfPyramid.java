package Pattern;

import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for the pyramid :  ");
        int B = A.nextInt();
        int C = 1;
        for (int P = B;P>=1;P--){
            for(int Q = 1;Q<=B-P;Q++){
                System.out.print(" ");
            }
            for(int R = 1;R<=P;R++){
                System.out.print(C+" ");

            }
            System.out.println();
            C++;
        }
        A.close();

    }
}
