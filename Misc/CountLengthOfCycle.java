import java.util.Map;

/**
 * Problem Statement:
 * <p>
 * You are given an integer array of size N.
 * Every element of the array is greater than or equal to 0.
 * Starting from arr[startIndex], follow each element to the index it points to.
 * Continue to do this until you find a cycle.
 * Return the length of the cycle. If no cycle is found return -1
 * <p>
 * Examples:
 * <p>
 * <p>
 * Signature:
 * Int countLengthofcycle(arr, startIndex){
 * }
 * Test Cases:
 * Input :
 * arr: [1,0]
 * startIndex: 0
 * Output :2
 * <p>
 * Input :
 * arr: [1,2,0]
 * startIndex: 0
 * Output :2
 */
public class CountLengthOfCycle {
    static boolean[] visited;

    static int countLengthofcycle(int[] a, int startIndex) {
        visited = new boolean[a.length];
        if (startIndex < 0 || startIndex > a.length - 1) {
            return -1;
        }
        visited[startIndex] = true;
        int loopStart = findStartIndex(a, a[startIndex], startIndex);
        if (loopStart == -1) {
            return -1;
        }
        return findLength(a,loopStart,a[loopStart],1);
    }

    static int findStartIndex(int a[], int currentIndex, int startIndex) {
        if (currentIndex > a.length - 1) {
            return -1;
        }
        if (visited[currentIndex]) {
            return currentIndex;
        }
        visited[currentIndex]=true;
        return findStartIndex(a, a[currentIndex], startIndex);
    }

    static int findLength(int a[], int startPoint, int currentIndex, int length) {
        while (currentIndex != startPoint) {
            currentIndex= a[currentIndex];
            length++;
        }
        return length;
    }

    public static void main(String args[]) {
        System.out.println(countLengthofcycle(new int[]{1, 0}, 0));
        System.out.println(countLengthofcycle(new int[]{1, 2, 0}, 0));
        System.out.println(countLengthofcycle(new int[]{3, 0, 1, 2}, 0));
        System.out.println(countLengthofcycle(new int[]{0, 1}, 0));
        System.out.println(countLengthofcycle(new int[]{1, 2, 5}, 0));
    }

}
