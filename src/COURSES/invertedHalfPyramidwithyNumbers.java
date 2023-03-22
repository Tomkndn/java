package COURSES;

import java.util.Scanner;

public class invertedHalfPyramidwithyNumbers {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the number of rows :  ");
        int B = A.nextInt();

        for (int P = B;P>=1;P--){
            for (int Q = 1;Q<=P;Q++){

                System.out.print(Q);
            }
            System.out.println();
        }
        A.close();


    }
}
