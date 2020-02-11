package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-12-14 16:58
 */

public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = input.nextInt();
        System.out.println("The sum of digits for " + value + " is " + sumDigits(value));
    }

    public static int sumDigits(long n) {
        long temp = (long)Math.abs(n);
        int result = 0;
        while(temp != 0){
            int digit = (int)(temp % 10);
            result += digit;
            temp /= 10;
        }
        return result;
    }
}

