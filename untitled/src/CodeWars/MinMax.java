package CodeWars;

public class MinMax {
    public static void main(String[] args) {
        int[] list = {1,3,5,2,9,9,11};
        System.out.println(max(list));
        System.out.println(min(list));

    }
    public static int min(int[] list) {
        int val = list[0]; // initialize val with the first element of the array
        for (int i = 1; i < list.length; i++) {
            if (list[i] < val) {
                val = list[i]; // update val if the current element is greater
            }
        }
        return val;
    }

    public static int max(int[] list) {
        int val = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > val) {
                val = list[i];
            }
        }
        return val;
    }
}
