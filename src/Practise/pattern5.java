package Practise;

import java.util.Scanner;

public class pattern5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Lines for the Pattern ?  ");
        int N = sc.nextInt();
        for(int A= 1 ; A <= N ; A++){
            for(int B= 1 ; B <= A-1 ; B++) {
                System.out.print("  ");
            }
            for(int B = 1 ; B <= N-A+1 ; B++){
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();


    }
}
