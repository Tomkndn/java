package Pattern;
import  java.util.Scanner;
public class halfPyramidWithNumbers {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for the pyramid :  ");
        int B = A.nextInt();
        for (int P = 1;P<=B;P++){
            for(int Q = 1;Q<=B-P;Q++){
                System.out.print(" ");
            }
            for(int R = 1;R<=P;R++){
                System.out.print(R+" ");
            }
            System.out.println();
        }
        A.close();
    }
}
