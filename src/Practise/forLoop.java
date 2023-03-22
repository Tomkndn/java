package Practise;

public class forLoop {
    public static void main(String[] args) {

        int result=1;
//        int A=1;
//        int B=1;
        for(int A =1; A<=20;A++) {

            for (int B = 1; B <= 10; B++) {
                result = A * B;
//                int A = 1;
//                int B = 1;
                System.out.println(A+" X "+B+" = "+result);
            }
        }   System.out.println();
    }
}
