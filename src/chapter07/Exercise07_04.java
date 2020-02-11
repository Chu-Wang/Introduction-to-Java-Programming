package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 13:54
 */
public class Exercise07_04 {
    public static void main(String[] args) {
        double[] scores = new double[100];
        double sum = 0;
        int count = 0;
        double item;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new scores: ");
        do {
            item = input.nextDouble();
            if (item >= 0) {
                scores[count] = item;
                sum += item;
                count++;
            }
        } while (item >= 0);

        System.out.println("count is " + count);
        double average = (sum) / count;
        int numOfAbove = 0;
        int numOfBelow = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                numOfAbove++;
            } else {
                numOfBelow++;
            }
        }
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average " + numOfAbove);
        System.out.println("Number of scores below the average " + numOfBelow);

    }
}
