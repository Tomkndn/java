package com.cbse;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        String name = new String();
//        int A = new int();
 //       int B = new int();
///        int C = new int();
//        int D = new int();
//        int E = new int();
 //       int marks = new int();
        Scanner Sc = new Scanner(System.in);
        System.out.print("What is your name?:  ");
        String name = Sc.next();
        Scanner ST = new Scanner(System.in);
        System.out.print("Total Marks of all the subject:  ");
        float marks = ST.nextFloat();

        Scanner AB = new Scanner(System.in);
        System.out.print("Marks in 1st Subject:  ");
        float A = AB.nextFloat();
        Scanner BC = new Scanner(System.in);
        System.out.print("Marks in 2nd Subject:  ");
        float B = BC.nextFloat();
        Scanner CD = new Scanner(System.in);
        System.out.print("Marks in 3rd Subject:  ");
        float C = CD.nextFloat();
        Scanner DE = new Scanner(System.in);
        System.out.print("Marks in 4th Subject:  ");
        float D = DE.nextFloat();
        Scanner EF = new Scanner(System.in);
        System.out.print("Marks in 5th Subject:  ");
        float E = EF.nextFloat();
//        int A = AB.nextInt();
//        int B = BC.nextInt();
//        int C = CD.nextInt();
//        int D = DE.nextInt();
//        int E = EF.nextInt();
        float T = (float) (A + B + C + D + E);
        float U = T / marks;
        float V = U * 100;
        int W = (int) V;
        System.out.println("CONGRATULATIONS!!!!");
        System.out.print(name + " has scored "+V+ "% in CBSE Board Examination.");
 //       System.out.print(" has scored ");
   //     System.out.print(V);
     //   System.out.println("% in CBSE Board Examination.");
 //       System.out.println(W.hasNextInt());
    }
}
