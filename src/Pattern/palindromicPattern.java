package Pattern;
import java.util.Scanner;
public class palindromicPattern {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for the triangle : ");
        int B = A.nextInt();
        for (int P = 1; P <= B; P++) {
            for (int J=1;J<=B-P;J++){
                System.out.print(" ");
            }
            for(int J=P; J>=1;J--){
                System.out.print(J);
            }
            for(int J=2; J<=P;J++){
                System.out.print(J);
            }
            System.out.println();
        }
        A.close();
    }
}
