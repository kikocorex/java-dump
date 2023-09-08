package StringManipualtion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Dog";
       String substring = str.substring(2);
        System.out.println(substring);

        // IMPORTANT! (Comparing Strings)
        String str1 = "cat";
        String str2 = "dog";
        boolean isEqual = str.equals(str1); //compare IF EQUAL
        boolean isIgnoreEqualCase = str.equalsIgnoreCase(str2); // compare IF EQUAL *IGNORE CASE*
        int compareResult = str.compareTo(str2); // compare to a string with a return value int
        System.out.println("Equal: " + isEqual);
        System.out.println("Ignore equal case: " + isIgnoreEqualCase);
        System.out.println("Compare to" + compareResult);


        // IMPORTANT! (Replacing/modifying strings)
        String replace = str.replace("Dog", "Mouse"); //replace a specific string to target
        String modified = str.replaceAll("[aA-zZ]",""); //replace the arg1 (regex) to 2nd arg
        System.out.println("Replaced from " + str + " to " + replace);
        System.out.println("Modified is " + modified);

        // IMPORTANT!! (Splitting a sentence into words)
        String sentence = "Java is a shit language";
        String[] words = sentence.split(" ");

        for(String word : words) {
            System.out.println(word);
        }


        // IF ELSE SHORT-CUT
        int x = 20;
        System.out.println((x < 20) ? "error" : "dog");

        int[] numbers = {1,2,3,4};

        System.out.println(Arrays.toString(numbers));

        for(int number : numbers) {
            System.out.println(number);
        }

        for(int i = 0; i <= numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }

        String dog = "s";


    }
}
