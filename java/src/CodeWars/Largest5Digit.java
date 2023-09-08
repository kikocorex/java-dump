package CodeWars;

public class Largest5Digit {
    public static void main(String[] args) {

        System.out.println(solve("123454"));

    }

    public static int solve(final String digits) {
        int largest = 0;

        for (int i = 0; i <= digits.length() - 5; i++) {
            int currentNumber = Integer.parseInt(digits.substring(i, i + 5));
            largest = Math.max(largest, currentNumber);
        }

        return largest;
    }
}
