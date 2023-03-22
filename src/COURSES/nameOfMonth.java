package COURSES;
import java.util.Scanner;
public class nameOfMonth {
    public static void main(String[] args){
      Scanner A = new Scanner(System.in);
      System.out.print("Enter the number of the Month :  ");
      int B = A.nextInt();
      switch (B){
          case 1 :
              System.out.print("   JANUARY");
              break;
          case 2 :
              System.out.print("   FEBRUARY");
              break;
          case 3 :
              System.out.print("   MARCH");
              break;
          case 4 :
              System.out.print("   APRIL");
              break;
          case 5 :
              System.out.print("   MAY");
              break;
          case 6 :
              System.out.print("   JUNE");
              break;
          case 7 :
              System.out.print("   JULY");
              break;
          case 8 :
              System.out.print("   AUGUST");
              break;
          case 9 :
              System.out.print("   SEPTEMBER");
              break;
          case 10 :
              System.out.print("   OCTOBER");
              break;
          case 11 :
              System.out.print("   NOVEMBER");
              break;
          case 12 :
              System.out.print("   DECEMBER");
              break;
          default :
              System.out.print("Invalid Month number!!!!");

        }
        A.close();


    }
}
