/**
 * Problem Statement-
 * For a string input the function returns output encoded as follows:
 * <p>
 * "a" -> "a1"
 * "aa" -> "a2"
 * "aabbb" -> "a2b3"
 * "aabbbaa" -> "a2b3a2"
 * <p>
 * Signature :
 * String rle(String input) {
 * }
 * <p>
 * Test Case:
 * Input : aaabbbaad
 * Output: a3b3a2d1
 *
 */
public class RunLengthEncoding {

    static String  rle(String input)
    {
        if(input==null)
        {
            return  "";
        }
        String result ="";
        for(int i =0;i<input.length();i++)
        {
            int length=1;
            char currentChar = input.charAt(i);
            while (i<input.length()-1)
            {
                if(input.charAt(i)==input.charAt(i+1))
                {
                    length++;
                    i++;
                    continue;
                }
                break;
            }
            result = result+currentChar+length;

        }
        return result;
    }

    public static void main(String args[])
    {
        System.out.println(rle("a"));
        System.out.println(rle("aaabbbcca"));
        System.out.println(rle("aaabbbaad"));
    }
}
