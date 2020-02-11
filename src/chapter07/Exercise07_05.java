package chapter07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 14:10
 */
public class Exercise07_05 {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // numbers array will store distinct values, maximum is 10
        int numberOfDistinctValues = 0; // How many distinct numbers are in the
        // array
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            // Read an input
            int value = input.nextInt();

            int j = 0;
            for (; j < numberOfDistinctValues; j++)
                if (numbers[j] == value) {
                    break; // It is in the numbers array, skip
                }

            // j == numberOfDistinctValues indicates that value is not in numbers array, add it to it
            if (j == numberOfDistinctValues) {
                numbers[numberOfDistinctValues] = value; // value is not in numbers array yet, store it
                numberOfDistinctValues++;
            }
        }

        System.out.println("The number of distinct values is " + numberOfDistinctValues);
        for (int i = 0; i < numberOfDistinctValues; i++)
            System.out.print(numbers[i] + " ");

    }
}
