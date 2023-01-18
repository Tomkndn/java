package BTech;
import java.util.Scanner;

public class lexicographicalOrder {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int slen = s.length();
        String[] arr1=new String[slen-k+1];
        for (int i =0;i<slen-k+1;i++){
            String s1=s.substring(i,i+3);
            arr1[i]=s1;
        }
        // smallest / lagest
        for (int i = 0;i<arr1.length;i++){
            smallest = arr1[i];
            largest = arr1[i];
            for (int j = 0; j<slen-k+1;j++){
                if (smallest.compareTo(arr1[j])>0){
                    smallest=arr1[j];
                }else if (largest.compareTo(arr1[j])<0){
                    largest=arr1[j];
                }

            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}