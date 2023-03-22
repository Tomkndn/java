package BTech;
import java.util.Scanner;
public class guessingTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double myNum1 = Math.random()*1000;
//        System.out.println(myNum1);
        int myNum = (int)myNum1;
        int yourNum = 0;
        System.out.println("Type number/If not type 0. ");
        do {
            System.out.print("Guess my number(1-1000): ");
            yourNum = sc.nextInt();
            if (yourNum == myNum){
                System.out.println("HOORAY!!! You guessed my number.");
                break;
            }else if (yourNum > myNum){
                System.out.println("OOPS!!! My number is little bit smaller.");
                System.out.println("---TRY AGAIN---");
            }else{
                System.out.println("OOPS!!! My number is little bit larger.");
                System.out.println("---TRY AGAIN---");
            }
        }while (yourNum > 0);
        System.out.println("My number was "+myNum);
        sc.close();
    }
}
