package Practise;

import java.util.Scanner;

public class pattern2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Lines for the Pattern ?  ");
        int N = sc.nextInt();

        for (int A = 1; A <= N; A++) {

            for (int B = N; B >= A; B--) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
