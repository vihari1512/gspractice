import java.util.HashMap;
import java.util.Map;

public class FirstNonRepChar {
    /**
     * Problem Statement –
     * Finds the first character that does not repeat anywhere in the input string
     * If all characters are repeated, return 0
     * Given “apple”, the answer is “a”
     * Given “racecars”, the answer is “e"
     * <p>
     * Signature :
     * char findFirst(String input){
     * }
     * <p>
     * Test Cases-
     * Input: apple
     * Output: a
     * <p>
     * Input – xxyyzz
     * Output - 0
     */
    static char findFirst(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (Character c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Character c : input.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String args[]) {
        System.out.println(findFirst("apple"));
    }

}
