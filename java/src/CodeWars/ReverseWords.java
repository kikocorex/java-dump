package CodeWars;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords("test! how are you doing"));
    }
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversed.append(reversedWord).append(" ");
        }

        return reversed.toString().trim();
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}

