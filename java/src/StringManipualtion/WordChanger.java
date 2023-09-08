package StringManipualtion;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordChanger {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String[] theFruits= {"Apple", "Orange", "Grapes"};

        System.out.println("If you input fruits it will turn into the word dog");
        System.out.println("Input your sentence: ");
        String sentence = kbd.nextLine();

        String newSentence = "";

        Pattern pattern = null;

        for(int i = 0; i < theFruits.length; i++) {
            System.out.println(i + " Checking the words...");
            pattern = Pattern.compile(theFruits[i], Pattern.CASE_INSENSITIVE);
        }
        Matcher matcher = pattern.matcher(sentence);

        if (matcher.find()) {
            System.out.println("A fruit has been detected!");
            newSentence = sentence.replaceAll(String.valueOf(pattern),"dog");
            System.out.println("Changing the fruits into something better.... ");
        }
        System.out.println("Done!");
        System.out.println(newSentence);


    }
}
