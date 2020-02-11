package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-12-14 20:06
 *
 */
public class Exercise06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three values: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    }
}
