package CodeWars;

public class NameOnBillboard {

    public static void main(String[] args) {

        System.out.println(billboard("Jacob War",100));

    }

    public static int billboard(String name, int price) {
        int newPrice = 0;

        for (int i = 0; i < name.length(); i++) {
            if (price >= 0) {
                System.out.println("Price found! Fee per letter will be " + price);
                newPrice += price;
                System.out.println(i);
            } else {
                System.out.println("Price not found! Fee per letter will be 30 pesos");
                newPrice += 30;
                System.out.println(i);
            }
        }
        return newPrice;
    }
}
