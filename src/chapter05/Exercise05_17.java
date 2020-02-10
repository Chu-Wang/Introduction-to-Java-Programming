package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-08 22:14
 */
public class Exercise05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        if (numberOfLines < 1 || numberOfLines > 15) {
            System.out.println("You must enter a number from 1 to 15");
            System.exit(1);
        }
        for (int row = 1; row <= numberOfLines; row++) {
            for (int column = 1; column <= numberOfLines - row; column++)
                System.out.print("   ");

            for (int num = row; num >= 1; num--)
                System.out.print((num >= 10) ? " " + num : "  " + num);

            for (int num = 2; num <= row; num++)
                System.out.print((num >= 10) ? " " + num : "  " + num);

            System.out.println();
        }
    }
}
