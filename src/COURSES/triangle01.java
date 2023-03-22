package COURSES;

import java.util.Scanner;

public class triangle01 {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the number of rows :  ");
        int B = A.nextInt();

        for (int P = 1;P<=B;P++){
            for (int Q = 1;Q<=P;Q++){
                int sum = P+Q;
                if (sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }


            }
            System.out.println();
        }
        A.close();


    }
}
