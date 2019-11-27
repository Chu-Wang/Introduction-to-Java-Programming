package chapter02;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-11-27 22:13
 */
public class Exercise02_03 {
    public static void main(String[] args) {
        // Enter foot
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet =  scanner.nextDouble();
        double meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meters");
    }
}
