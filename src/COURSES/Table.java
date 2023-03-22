package COURSES;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Write the Table which you want :  ");
        int D = A.nextInt();
        int B = 0;
        int C = 1;
        while(B<=9){
            B = B+1;
            C= D * B ;
            System.out.println( D + "X" + B + "=" + C );
        }
        A.close();

    }
}
