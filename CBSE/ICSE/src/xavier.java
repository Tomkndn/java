import java.util.Scanner;

public class xavier {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.println("What is your name?:  ");
        String B = A.next();

        // Scanner I = new Scanner(System.in);
        System.out.println("Total Marks in each subject:  ");
        Float J = A.nextFloat();

        // Scanner C = new Scanner(System.in);
        System.out.println("How much you Scored in Math:  ");
        Float D = A.nextFloat();

        // Scanner E = new Scanner(System.in);
        System.out.println("How much you Scored in Physics:  ");
        Float F = A.nextFloat();

        // Scanner G = new Scanner(System.in);
        System.out.println("How much you Scored in Chemistry:  ");
        Float H = A.nextFloat();

        Float K = ((D + F + H)/J)*100 ;
        Float[] L = {D,F,H};
 //       i=0;
 //       for( L=i ; i<3 ; i= i+1) {
  //          if (L[0] <= 40.0)
 //               System.out.println("OOPS!!!!! You are failed in one Subject.");
 //           else
 //               System.out.println("Congratulations, you have passed in all subject.");
        A.close();
        }

    }
//}
