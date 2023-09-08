package ForLoops;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Input width and height: ");
        int number = kbd.nextInt();

      for (int i = 1; i <= number; i++) {

          for (int j = 1; j <= i; j++) {
              System.out.println("*" + " ");


          }
          System.out.println(" ");
      }
    }
}
