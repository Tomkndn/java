package BTech;
import java.util.Scanner;
import java.lang.Math;
public class binomial {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.close();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = 0;
            for(int j = 0; j<n; j++){
                double res1 = Math.pow(2,j);
                int res2 = (int)res1;
//                System.out.println(res2);
                int res3 = res2 * b;
                res = res + res3;
                System.out.print(res+a+" ");
            }
            System.out.println();
        }
    }
}
