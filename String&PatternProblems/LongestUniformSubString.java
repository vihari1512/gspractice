import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement-
 * This method should return an integer array with two elements that correctly identifies the location of the longest
 * uniform substring within the input string. The first element of the array should be the starting index of the longest
 * substring and the second element should be the length.
 * <p>
 * input: abbbccda the longest uniform substring is bbb (which starts at index 1 and is 3 characters long.
 * <p>
 * Signature :
 * int[] longestUniformSubstring(String input) {
 * }
 * <p>
 * Test Cases –
 * Input : aabbbbbCdAA
 * Output – [2,5]
 */
public class LongestUniformSubString
{
    class SizeStarIndex
    {
        int size;
        int startIndex;
        public SizeStarIndex(int s, int stat)
        {
            this.size = s;
            this.startIndex = stat;
        }
    }
    int[] longestUniformSubstring(String input)
    {
        char[] inputCharArray = input.toCharArray();
        Map<Character,SizeStarIndex> charMaxIndexMap = new HashMap<>();
        int maxSizeTillNow = Integer.MIN_VALUE;
        SizeStarIndex result = new SizeStarIndex(0,0);
        for(int i=0;i<inputCharArray.length-1;i++)
        {
            int start = i;
            int length=1;
            while(i<inputCharArray.length-1 && inputCharArray[i]==inputCharArray[i+1])
            {
                length=length+1;
                i=i+1;
            }
            if(charMaxIndexMap.get(inputCharArray[i])!=null
                    && charMaxIndexMap.get(inputCharArray[i]).size<length)
            {
                SizeStarIndex s = new SizeStarIndex(length,start);
                charMaxIndexMap.put(inputCharArray[i],s);
            }
            else
            {
                charMaxIndexMap.put(inputCharArray[i], new SizeStarIndex(length, start));
            }
            if(length>maxSizeTillNow)
            {
                result = new SizeStarIndex(length,start);
                maxSizeTillNow=length;
            }
        }
        return new int[]{result.startIndex,result.size};
    }
    public static void main(String[] args)
    {
        LongestUniformSubString ls = new LongestUniformSubString();
        int[] result =ls.longestUniformSubstring("aabbbbbCdAAbbbbbbXXXaaaaaaaaYYYYYYYYYYZ");
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }

    }
}
