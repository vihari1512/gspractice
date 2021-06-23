/**
 * Problem Statement:
 * There is a staircase with ‘n' number of steps. A child
 * walks by and wants to climb up the stairs, starting at
 * the bottom step and ascending to the top.
 * Of course, the child wants to have fun, too, so instead
 * of taking 1 step at a time, it will vary between taking
 * either 1, 2 or 3 steps at a time.
 * Please complete the ‘countSteps' method below so that
 * given 'n' number of steps it will return the number of
 * unique combinations the child could traverse.
 * An example would be countSteps(3) == 4:
 * <p>
 * Signature :
 * public static Integer countSteps(Integer n) {
 * }
 */
import java.util.*;
public class Staircase {
    static Map<Integer,Integer> stepCountMap = new HashMap<>();
    public static Integer countSteps(Integer n)
    {
        if(stepCountMap.get(n)!=null)
        {
            return stepCountMap.get(n);
        }
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        stepCountMap.put(n,countSteps(n-1)+countSteps(n-2)+countSteps(n-3));
        return stepCountMap.get(n);
    }
    public static void main(String args[])
    {
        System.out.println(countSteps(10));
    }
}
