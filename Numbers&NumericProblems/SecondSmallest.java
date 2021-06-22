import java.awt.*;
import java.util.*;

/**
 * Problem Statement-
 * Returns second smallest element in array x. If x has fewer than 2 elements returns 0.
 * <p>
 * Signature:
 * int secondSmallest(int[] x)
 * <p>
 * Test Cases:
 * Input:[ -1, 0, 1, -2, 2]
 * Output: -1
 * <p>
 * Input:[ 0, 1]
 * Output: 1
 */
public class SecondSmallest {
    static int secondSmallest(int[] x) {
        int smallest = Integer.MAX_VALUE;
        for (int y : x) {
            if (y < smallest) {
                smallest = y;
            }
        }
        int secondSmallest = Integer.MAX_VALUE;
        for (int y : x) {
            if (y != smallest && y < secondSmallest) {
                secondSmallest = y;
            }
        }
        return secondSmallest;
    }

    static int secondSmallestPQ(int[] x) {
        Queue<Integer> pq = new PriorityQueue<>();
        Set<Integer> uniqueness = new HashSet<>();
        for (int y : x) {
            if (!uniqueness.contains(y)) {
                pq.add(y);
                uniqueness.add(y);
            }
        }
        pq.poll();
        return pq.poll();
    }

    public static void main(String args[]) {
        System.out.println(secondSmallest(new int[]{-1, 0, 1, -2, -2, 2}));
        System.out.println(secondSmallestPQ(new int[]{-1, 0, 1, -2, -2, 2}));
    }
}
