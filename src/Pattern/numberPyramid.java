package Pattern;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for Number Pyramid : ");
        int B = A.nextInt();
        for (int P = 1; P <= B; P++) {
            for (int R = 1;R<=(B-P);R++){
                System.out.print(" ");
            }
            for(int j=1;j<=P;j++){
                System.out.print(P+" ");
            }
            System.out.println();
        }
        A.close();
    }
}
