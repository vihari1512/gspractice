/**
 * Problem Statement:
 * Your task is ultimately to implement a function that takes in an array and a integer.
 * You want to return the *LENGTH* of the shortest subarray whose sum is at least the integer,
 * and -1 if no such sum exists.
 * <p>
 * Signature:
 * <p>
 * public static int subArrayExceedsSum(int arr[], int target) {
 * }
 * <p>
 * Test Cases:
 * Input:[1,2,3,4] , k=6
 * Output :2
 * <p>
 * Input:[1,2,3,4,] , k=-1
 * Output :12
 */
public class SubArrayExceedingSum {

    public static int subArrayExceedsSum(int arr[], int target)
    {
        int length=Integer.MAX_VALUE;
        int sum = 0;
        int start =0;
        for(int end=0;end<arr.length;end++)
        {
            sum = sum+arr[end];
            while (sum>=target)
            {
                if(length>end-start+1)
                {
                    length=end-start+1;
                }
                sum=sum-arr[start];
                start++;
            }
        }
        return length==Integer.MAX_VALUE?-1:length;
    }
    public static void main(String args[])
    {
        System.out.println(subArrayExceedsSum(new int[]{1,2,3,4},6));
        System.out.println(subArrayExceedsSum(new int[]{1,2,3,4},12));
    }
}
