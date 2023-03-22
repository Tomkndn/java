package String;
import java.util.Scanner;
public class replace {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter your String:  ");
        StringBuilder B = new StringBuilder(A.nextLine());
        System.out.print("Enter the Letter you want to replace:  ");
        // String C = A.next();
        // int M = B.indexOf(C,0);
//        System.out.println(M);
        System.out.print("Enter the replacing letter:  ");
        // String D = A.next();
//        String N;
//        N = B.replace(C,D);
        System.out.println(B);
//        System.out.print("Your String becomes:"+B);
        A.close();

    }
}
