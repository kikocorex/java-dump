package StringManipualtion;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "programming";

        String result = removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("String with Duplicates Removed: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
               // result.append(ch);
                seen[ch] = true;
            }
        }

        return result.toString();
    }
}
