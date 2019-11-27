package chapter02;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-11-27 22:08
 */
public class Exercise02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
