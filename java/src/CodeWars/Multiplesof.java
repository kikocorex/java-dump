package CodeWars;

public class Multiplesof {
    public static void main(String[] args) {
        System.out.println(solution(10));

    }
 public static int solution(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {

        if (i % 5 == 0 || i % 3 == 0) {
            sum = i + sum;
         }
       }
    return sum;
    }
}
