package Pattern;
import java.util.Scanner;
public class hollowButterfly {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the rows for the Butterfly :  ");
        int B = A.nextInt();

        for(int P = 1;P<=B;P++){
            for(int R = 1;R<=P;R++){
                if(P==1||R==1||P==2*B||R==2*B){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int Q = 1;Q<=2*(B-P);Q++){
                System.out.print("  ");
           }
            for(int R = 1;R <= P; R++){
                if(P==1||R==1||P==2*B||R==2*B){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int P = B; P >= 1; P--) {
            for (int Q = 1; Q <= P; Q++) {
                if(P==1||Q==1||P==2*B||Q==2*B){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            for (int R = 1; R <= 2 * (B - P); R++) {
                System.out.print("  ");
            }
            for (int Q = 1; Q <= P; Q++) {
                if(P==1||Q==1||P==2*B||Q==2*B){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        A.close();
    }
}
