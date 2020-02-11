package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-12-14 17:07
 */
public class Exercise06_04 {
    public static void main(String[] args) {
        System.out.print("Enter an positive integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
        System.out.println();
    }
}


