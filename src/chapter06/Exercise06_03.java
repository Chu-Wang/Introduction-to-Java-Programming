package chapter06;

/**
 * @author WangMingMing
 * @creat 2019-12-14 17:01
 */
import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a postive integer: ");
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is palindrome");
        else
            System.out.println(number + " is not palindrome");
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }
        return result;
    }
}
