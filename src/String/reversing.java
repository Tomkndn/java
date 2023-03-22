package String;
import java.util.Scanner;
public class reversing {
    public static void main (String[] args){
//        String firstName = "Tony";
//        String secondName = "Stark";
        System.out.print("Enter your name:  ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        int A = fullName.length() - 1;
        for(int i=A; i>=0; i--) {
            System.out.print(fullName.charAt(i));
        }
        sc.close();
    }

}
