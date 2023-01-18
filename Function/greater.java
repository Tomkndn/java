package Function;
import java.util.Scanner;
public class greater {
    public static int greater(int A, int B){
        int M = 0;
        if (A>B){
            M =A;
        }else{
            M =B;
        }
        System.out.print("Greater number is:  " + M);
        return M;
    }
    public static void main (String []args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the first number:  ");
        int B= A.nextInt();
        System.out.print("Enter the Second number:  ");
        int C = A.nextInt();
        greater(B,C);
    }

}
