package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class TwoNumbersPostivie {
    public static void main(String[] args) {

        if(checkNumbers(-1,2,3)) {
            System.out.println("TRUE");
        }
        System.out.println("fuck");

    }

    public static boolean checkNumbers(int a, int b, int c) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        int counter = 0;

        for(int pos: numbers) {
            System.out.println(pos);
            if (pos > 0) {
                System.out.println("POSITIVE!");
                counter++;
            } else {
                System.out.println("NEGATIVE");
            }
        }

            if(counter == 2) {
                return true;
            }
            return false;

    }
}
