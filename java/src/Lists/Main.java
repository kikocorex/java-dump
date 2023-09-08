package Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        Main dog = new Main();
        boolean result = dog.checkNumbers(l1);

        if (result) {
            System.out.println("All numbers match their indexes.");
        } else {
            System.out.println("Not all numbers match their indexes.");
        }
    }

    public boolean checkNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != i) {
                return false;
            }
        }
        return true;
    }
}
