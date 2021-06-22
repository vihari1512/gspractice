/**
 Problem Statement :
 Takes String str and returns a new String
 such that the characters are in reversed order.
 Example: reverseStr(str) where str is “abcd " returns “dcba".

 Signature: public static String reverseStr( String str ){
 }

 Test Cases:
 Input : abcd
 Output: dcba

 */
public class ReverseString {
    public static String reverseStr( String str )
    {
        String result ="";

        for(int i=str.length()-1;i>=0;i--)
        result= result+str.charAt(i);

        return result;
    }
    public static void main(String args[])
    {
        System.out.println(reverseStr("abcd"));
    }

}
