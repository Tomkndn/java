package Practise;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of grids You have to make? ");
        int N = sc.nextInt();
        for(int A=1;A<=N;A++) {
            for (int B = 1; B <= N; B++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
