import java.util.Locale;

/**
 * Problem Statement-
 * The sentence The quick brown fox jumps over the lazy dog contains
 * every single letter in the alphabet. Such sentences are called pangrams.
 * write a function findMissingLetters, which takes a String sentence,
 * and returns all the letters it is missing (which prevent it from
 * being a pangram). You should ignore the case of the letters in sentence,
 * and your return should be all lower case letters, in alphabetical order.
 * you should also ignore all non US-ASCII characters.
 * <p>
 * Signature:
 * <p>
 * String findMissingLetters(String sentence) {
 * }
 * <p>
 * Test Cases:
 * Input: The slow purple oryx meanders past the quiescent canine
 * Output: bfgjkvz
 */
public class Pangram {

    static String findMissingLetters(String sentence)
    {
        sentence = sentence.toLowerCase();
        boolean[] alphabetOccurance = new boolean[26];
        for(char c: sentence.toCharArray())
        {
            int resultChar = c-97;
            if(resultChar>=0 && resultChar<26)
            {
                alphabetOccurance[resultChar] = true;
            }
        }
        String result ="";
        for(int i=0;i<26;i++)
        {
           if(!alphabetOccurance[i])
           {

               result = result+(char)(i+97);
           }
        }
        return result;
    }

    public static void main(String args[])
    {
        System.out.println(findMissingLetters("The slow purple oryx meanders past the quiescent canine"));
    }
}
