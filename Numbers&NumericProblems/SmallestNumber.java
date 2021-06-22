/**
 * Problem Statement-
 * Returns the smallest number in array that has been rotated
 * For example - Array {3,4,5,6,1,2} returns 1
 * Input array was originally sorted in increasing orders
 * FindMinInArray must have O(log n) runtime
 * Input array does not have any duplicates
 * Signature:
 * public static int FindMin(int a[]){
 * }
 * <p>
 * Test Cases:
 * Input: [3, 4, 5, 6, 1, 2]
 * Output: 1
 * <p>
 * Input: [2, 1]
 * Output:1
 */
public class SmallestNumber {
    public static int FindMin(int a[]) {
        return binSearch(a,0,a.length-1);
    }

    static int binSearch(int a[], int l, int h) {
        int mid = (l + h) / 2;
        if(l==h)
        {
            if(l==0)
            {
                if(a[l]<a[l+1] && a[l]<a[a.length-1])
                {
                    return l;
                }
                return 0;
            }
            if(h==a.length-1)
            {
                if(a[h]<a[h-1] && a[h]<a[0])
                {
                    return l;
                }
                return 0;
            }
        }
        if (a[mid] < a[mid + 1] && a[mid] < a[mid - 1]) {
            return mid;
        }
        if (a[mid] < a[mid + 1] && a[mid] > a[h]) {
            return binSearch(a, mid + 1, h);
        }
        if (a[mid] > a[mid + 1] && a[mid] < a[mid - 1]) {
            return binSearch(a, l, mid - 1);
        }
        if(a[mid]>a[mid-1] && a[mid]>a[h])
        {
            return binSearch(a,mid+1,h);
        }
        return 0;
    }
    public static void main(String args[])
    {
        System.out.println(FindMin(new int[]{3,4,5,6,1,2}));
        System.out.println(FindMin(new int[]{1,2,3,4,5,6}));
        System.out.println(FindMin(new int[]{2,3,4,5,6,1}));
    }
}
