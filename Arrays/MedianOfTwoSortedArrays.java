import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Problem Statement:
 * Find the median of the two sorted arrays
 * <p>
 * Signature:
 * public static double findMedianSortedArrays(int[] A, int[] B) {
 * }
 * <p>
 * Test Cases:
 * Input:
 * Arr1= [1,3];
 * Arr2 = [2,4];
 * Output:
 * 2.5
 * <p>
 * Input:
 * Arr1 = [1,3]
 * Arr2= [2]
 * Output:2.0
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] A, int[] B)
    {
        int[] result =mergedArray(A,B);
        if(result.length%2==0)
        {
            int length = result.length;
            return(double) (result[length/2-1]+result[length/2])/2;
        }
        return result[result.length/2];
    }
    static int[] mergedArray(int a[],int b[])
    {

        Queue<Integer> pqa = new PriorityQueue<>();
        Arrays.stream(a).forEach(pqa::add);
        Arrays.stream(b).forEach(pqa::add);
        int[] result = new int[pqa.size()];
        int i=0;
        while ( pqa.size()>0 )
        {
            result[i++]= pqa.poll();
        }
        return result;
    }

    public static void main(String args[])
    {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2,4}));
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }
}
