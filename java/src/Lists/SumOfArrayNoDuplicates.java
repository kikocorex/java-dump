package Lists;

import java.util.HashSet;
import java.util.Set;

public class SumOfArrayNoDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 4};
        SumOfArrayNoDuplicates test = new SumOfArrayNoDuplicates();
        Set<Integer> hashSetUnique = getUniqueNumbers(numbers);

        Integer[] uniqueNumbers = hashSetUnique.toArray(new Integer[hashSetUnique.size()]);
        int sum = solveSum(uniqueNumbers);
        System.out.println("Sum of unique numbers: " + sum);
    }

    public static HashSet<Integer> getUniqueNumbers(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int uniqueNumber : array) {
            uniqueNumbers.add(uniqueNumber);
        }
        return (HashSet<Integer>) uniqueNumbers;
    }

    public static int solveSum(Integer[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
