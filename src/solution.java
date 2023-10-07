import java.util.Arrays;

//public class solution {
public class solution {
    public static String findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1[] = new int[nums1.length+nums2.length];
        int i = 0;
        for (int j:nums1) {
            len1[i] = j;
            i++;
        }
        for (int k:nums2) {
            len1[i] = k;
            i++;
        }
        // Arrays.stream(len1).sorted();
        Arrays.sort(len1);
        for (int l:len1)
            System.out.println(l);
        double fnal;
        if (len1.length %2 != 0){
            int num = len1.length/2;
            fnal = len1[num];
        }else{
            int num = len1.length/2;
            fnal = (len1[num-1] + len1[num])/2.0;
        }
        // String a = 
        return String.format("%.6d",fnal);
    }
    public static void main(String[] args) {
        int num1[] =  {1,2};
        int num2[] = {3,4};
        System.out.print(findMedianSortedArrays(num1,num2));
    }
}
//}
