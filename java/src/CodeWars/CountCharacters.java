package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        System.out.println(count("dog eater"));
    }


    public static Map<Character, Integer> count(String str) {

        HashMap<Character, Integer> countMap = new HashMap<>();

        // iterate through the characters of the input string
        for(int i =0; i < str.length(); i++) {
            char character = str.charAt(i);

            // check per character, if it is a letter
            if (Character.isLetter(character)) {
                char lowerCase = Character.toLowerCase(character);
                countMap.put(str.charAt(i), countMap.getOrDefault(lowerCase,0) + 1); // default character count is 0
                // when for loop encounters the same character, increment by one
            }

        }
        return countMap;
    }
}
