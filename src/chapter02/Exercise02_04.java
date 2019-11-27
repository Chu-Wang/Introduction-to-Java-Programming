package chapter02;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-11-27 22:14
 */
public class Exercise02_04 {
    public static void main(String[] args) {
        // Prompt the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
