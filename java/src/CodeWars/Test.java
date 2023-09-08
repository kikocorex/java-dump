package CodeWars;

public class Test {

    public static void main(String[] args) {

        int[] cat = {134, 290, 299, 999};

        int[][] dog = {{123, 456, 234}, {999, 103, 929}};

        int maxNumber = cat[0]; // Initialize maxNumber with the first element of the array

        for (int i = 1; i < cat.length; i++) {
            if (cat[i] > maxNumber) {
                maxNumber = cat[i];
            }
        }

        System.out.println("The highest number in the array is: " + maxNumber);



    /*    int[] cat = {134, 290, 299, 999};

        int[][] dog = {{123, 456, 234}, {999, 103, 929}};

        int maxNumber = cat[0]; // Initialize maxNumber with the first element of the array

        for (int i = 1; i < cat.length; i++) {
            maxNumber = Math.max(maxNumber, cat[i]);
        }

        System.out.println("The highest number in the array is: " + maxNumber);*/
    }
}
