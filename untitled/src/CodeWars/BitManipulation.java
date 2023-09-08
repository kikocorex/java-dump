package CodeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BitManipulation {

    public static void main(String[] args) {
        System.out.println(Ret("1010101"));
    }

    public static long Ret(String input) {
        Pattern pattern = Pattern.compile("0");
        Matcher matcher = pattern.matcher(input);
        String stringResult = matcher.replaceAll("");

        if (stringResult.isEmpty()) {
            return 0;
        }

        long converted = Long.parseLong(stringResult, 2);

        return converted;
    }
}
