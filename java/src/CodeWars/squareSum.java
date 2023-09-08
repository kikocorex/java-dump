package CodeWars;

public class squareSum {
    public static void main(String[] args) {

    int[] array = {1,2,2};

        System.out.println(squareSum(array));


    }

    public static int squareSum(int[] n ) {

    int result = 0;

    for (int i = 0; i < n.length; i++) {
         int squared = (int) Math.pow(n[i],2);
        System.out.println(result);
         result += squared;
    }
    return result;
    }
}
