package CodeWars;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] dog = {"hey", "nigger", "sup!"};

        System.out.println(smash(dog));
    }

    public static String smash(String[] words) {
        return String.join(" ", words);
    }
}
