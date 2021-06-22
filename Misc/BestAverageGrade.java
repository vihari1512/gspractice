/**
 * Problem Statement:
 * Given a list of student test scores, find the best average grade.
 *  Each student may have more than one test score in the list.
 *
 *  Complete the bestAverageGrade function in the editor below.
 *  It has one parameter, scores, which is an array of student test scores.
 *  Each element in the array is a two-element array of the form [student name, test score]
 *  e.g. [ Bobby, 87 ].
 *  Test scores may be positive or negative integers.
 *
 *  If you end up with an average grade that is not an integer, you should
 *  use a floor function to return the largest integer less than or equal to the average.
 *  Return 0 for an empty input.
 *
 *  Example:
 *
 *  Input: 
 *  [ [ Bobby, 87 ],
 *      [ Charles, 100 ],
 *      [ Eric, 64 ],
 *      [ Charles, 22 ] ].
 *
 *  Expected output: 87
 *  Explanation: The average scores are 87, 61, and 64 for Bobby, Charles, and Eric,
 *  respectively. 87 is the highest.
 */
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
public class BestAverageGrade
{
    public static Integer bestAverageGrade(String[][] scores) {
        Map<String,Integer> nameMarksMap = new HashMap<>();
        int average =-1;
        for(String[] s:scores)
        {

             int currentAverage = (Integer.parseInt(s[1])+nameMarksMap.getOrDefault(s[0],Integer.parseInt(s[1])))/2;
             nameMarksMap.put(s[0],currentAverage);
        }
        for(Map.Entry e: nameMarksMap.entrySet())
        {
            int currentAverage = (Integer) e.getValue();
            if(currentAverage>average)
            {
                average=currentAverage;
            }
        }
        return average;
    }
    public static void main(String[] args)
    {
        String[][] input = {{"Sarah", "91"},
                {"Goldie", "92"},
                {"Elaine", "93"},
                {"Elaine", "95"},
                {"Goldie", "94"},
                {"Sarah", "93"}};
        System.out.println(bestAverageGrade(input));
    }

}
