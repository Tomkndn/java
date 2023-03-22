package Practise;

import java.util.Scanner;

public class pattern7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Lines for the Pattern ?  ");
        int N = sc.nextInt();
        for(int A= 1 ; A <= N ; A++){
            for(int B= N ; B >= A-1 ; B--) {
                System.out.print("  ");
            }
            for(int B = N ; B >= N-A+1 ; B--){
                System.out.print("*  ");

            }
            System.out.println();
        }
        sc.close();

    }
}
