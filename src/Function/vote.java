package Function;
import java.util.Scanner;
public class vote {
    public static int AGE(int A){
        if(A>=18){
            System.out.println("YOU ARE ELIGIBLE TO VOTE!!!!");
        }else{
            System.out.println("You are not eligible to vote!!!");
        }
        return A;
    }
    public static void main(String []args){
        Scanner A = new Scanner(System.in);
        System.out.print("ENTER YUR AGE:   ");
        int B = A.nextInt();
        AGE(B);
        A.close();
    }
}
