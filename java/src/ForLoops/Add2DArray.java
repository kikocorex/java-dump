package ForLoops;

public class Add2DArray {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}
            };

        for(int i = 0; i <= numbers.length -1  ; i++) {

            for(int j = 0; j <= numbers.length ; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
