package CodeWars;

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase("hello how are you?"));
        System.out.println(toJadenCase(null));
        System.out.println(toJadenCase(""));
    }

    public static String toJadenCase(String phrase) {

        // check if input is null or an empty string
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        StringBuilder builder = new StringBuilder();
        String[] words = phrase.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                builder.append(Character.toUpperCase(word.charAt(0)));
                builder.append(word.substring(1).toLowerCase());
                builder.append(" ");
            }
        }

        if (builder.length() > 0) {
            builder.setLength(builder.length() - 1);
        }

        return builder.toString();
    }

}
