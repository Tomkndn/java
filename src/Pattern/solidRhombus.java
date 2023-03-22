package Pattern;

import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for the rhombus : ");
        int B = A.nextInt();
        for (int P = 1; P <= B; P++) {
            for (int R = 1;R<=2*(B-P);R++){
                System.out.print("  ");
            }
            System.out.println("* * * * * *");
        }
        A.close();
    }
}
