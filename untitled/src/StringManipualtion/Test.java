package StringManipualtion;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     Scanner kbd = new Scanner(System.in);
     String input = kbd.nextLine();

        // Count and display the number of words
        String[] words = input.split("\\s+");
        for(String count : words) {
            System.out.println(count);
        }


    }
}
