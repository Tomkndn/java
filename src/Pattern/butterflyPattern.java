package Pattern;

import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for the butterfly : ");
        int B = A.nextInt();
        for (int P = 1; P <= B; P++) {
            for (int Q = 1; Q <= P; Q++) {
                System.out.print("* ");
            }
            for (int R = 1;R<=2*(B-P);R++){
                System.out.print("  ");
            }
            for (int Q = 1; Q <= P; Q++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int P = B; P >= 1; P--) {
            for (int Q = 1; Q <= P; Q++) {
                System.out.print("* ");
            }
            for (int R = 1;R<=2*(B-P);R++){
                System.out.print("  ");
            }
            for (int Q = 1; Q <= P; Q++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        A.close();

    }
}
