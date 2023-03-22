package COURSES;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the number of rows :  ");
        int B = A.nextInt();
        int C = 0;
        for (int P = 1;P<=B;P++){
            for (int Q = 1;Q<=P;Q++){
                C++;
                System.out.print(C+" ");
            }
            System.out.println();
        }
        A.close();


    }
}
