import java.util.*;

/**
 * Problem Statement:
 * Given a list of words, group them by anagrams
 * Input: List of cat, dog, god
 * Output: A Set of Sets of anagrams: {{‘cat'}, {‘dog', ‘god'}}
 * <p>
 * Signature : Set<Set<String>> group(List<String> words){
 * }
 * <p>
 * Test Cases –
 * Input : [cat, dog, god]
 * Output: [[cat],[dog,god]]
 */
public class GroupAnagrams {
    static Set<Set<String>> group(List<String> words) {
        Map<String, Set<String>> sortedWordSet = new HashMap<>();
        Set<Set<String>> result = new HashSet<>();
        for (String word : words) {
            char[] wArray = word.toCharArray();
            Arrays.sort(wArray);
            String sortedWord = new String(wArray);
            Set<String> set = sortedWordSet.get(sortedWord);
            if (set == null) {
                set = new HashSet<>();
                sortedWordSet.put(sortedWord, set);
            }
            set.add(word);
        }
        sortedWordSet.forEach((k, v) -> result.add(v));

        return result;
    }

    public static void main(String args[]) {
       List<String> input = new ArrayList<>();
       input.add("cat");
       input.add("dog");
       input.add("god");
        System.out.println(group(input));
    }

}
