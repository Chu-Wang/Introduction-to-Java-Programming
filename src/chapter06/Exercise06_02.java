package chapter06;

/**
 * @author WangMingMing
 * @creat 2019-12-14 16:58
 */

public class Exercise06_02 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = input.nextInt();

        System.out.println("The sum of digits for " + value +
                " is " + sumDigits(value));
    }

    public static int sumDigits(long n) {
        int temp = (int)Math.abs(n);
        int sum = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += remainder;
            temp = temp / 10;
        }

        return sum;
    }
}

