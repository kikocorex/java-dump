package Lists;

import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        SumOfArray sumOfArray = new SumOfArray();
        System.out.println(sumOfArray.GetSumOfArray(numbers));
    }


    public int GetSumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
       return sum;
    }
}

