package COURSES;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the column for the rectangle : ");
        int B = A.nextInt();
        System.out.print("Enter the rows for the rectangle : ");
        int C = A.nextInt();
        for (int P = 1; P <= B; P++) {
            for (int Q = 1; Q <= C; Q++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        A.close();
    }
}
