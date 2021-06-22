import java.util.*;
/**
 *
 * Problem Statement:
 * Given a string and size of the tuples, extracts all unique tuples(substrings) of the given size.
 *
 * Signature:
 *
 * HashSet<String> uniqueTuples( String input, int len ){
 * }
 *
 * Test Cases:
 * Input : abbccde, 2
 * Output : 		
 *        [ab
 *         bb,
 *         bc,
 *         cc,
 *         cd,
 *         de]
 */
public class UniqueTuples {
    static HashSet<String> uniqueTuples( String input, int len )
    {
        HashSet<String> uniqueSet = new HashSet<>();
        for(int i=0;i<input.length();i++)
        {
            int j =0;
            String tuple ="";
            for(;j<len && i+len<=input.length();j++)
            {
                tuple=tuple+input.charAt(i+j);
            }
            if(tuple.length()>0)
            uniqueSet.add(tuple);
        }
        return uniqueSet;
    }
    public static void main(String args[])
    {
        System.out.println(uniqueTuples("abbccde",2));
    }
    
}
