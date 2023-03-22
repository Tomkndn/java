package Pattern;
import java.util.Scanner;
public class diamondPattern {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for the Pattern : ");
        int B = A.nextInt();
        for (int P = 1; P <= B; P++) {
            for(int M=1;M<=B-P;M++){
                System.out.print(" ");
            }
            for(int N=1;N<=(2*P)-1;N++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int P = B; P >= 1;P--){
            for(int M=1;M<=B-P;M++){
                System.out.print(" ");
            }
            for(int N=1;N<=(2*P)-1;N++){
                System.out.print("*");
            }

            System.out.println();
        }
        A.close();
    }
}
