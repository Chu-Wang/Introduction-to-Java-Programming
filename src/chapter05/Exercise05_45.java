package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 11:16
 */
public class Exercise05_45 {
    public static void main(String[] args) {
        final int COUNT = 10;
        double digit = 0;
        double sum = 0;
        double squareSum = 0;
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < COUNT; i++){
            digit = input.nextDouble();
            sum += digit;
            squareSum += Math.pow(digit, 2);
        }
        double mean = sum / COUNT;
        double deviation = Math.pow(((squareSum - Math.pow(sum, 2) / COUNT) / (COUNT - 1)), 0.5);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);

    }
}
