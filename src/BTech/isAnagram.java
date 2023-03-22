package BTech;
import java.util.Scanner;

public class isAnagram {
    static boolean isgram(String a, String b) {
        // Complete the function
        String a1 = a.toLowerCase();
        char[] A = a1.toCharArray();
        String b1 = b.toLowerCase();
        char[] B = b1.toCharArray();
        int[] frA = new int[a1.length()];
        int[] frB = new int[b1.length()];
        boolean isfinal = false;
        if (a.length()!=b.length()){
            isfinal = false;
        }else{
            for(int i = 0 ; i<a1.length();i++){
                int count = 0 ;
                for (int j = 0 ; j<a1.length();j++){
                    if (A[i] == A[j]){
                        count++;
                    }
                    frA[i]=count;
                }
            }
            for(int i = 0 ; i<b1.length();i++){
                int count = 0 ;
                for (int j = 0 ; j<b1.length();j++){
                    if (A[i] == B[j]){
                        count++;
                    }
                    frB[i]=count;
                }
            }
            for (int i = 0 ; i<a1.length();i++){
                if (frA[i] == frB[i]){
                    isfinal=true;
                }else{
                    isfinal=false;
                    break;
                }
            }
        }
        return isfinal;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isgram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}