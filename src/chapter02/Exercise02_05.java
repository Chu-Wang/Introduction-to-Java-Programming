package chapter02;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-11-27 22:15
 */
public class Exercise02_05 {
    public static void main(String[] args) {
        // Read subtotal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subtotal and gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double rate = scanner.nextDouble();

        double gratuity = subtotal * rate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is " + gratuity + " total is " + total);
    }
}
