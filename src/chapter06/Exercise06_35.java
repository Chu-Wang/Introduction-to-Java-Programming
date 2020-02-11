package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 10:37
 */
public class Exercise06_35 {
    public static void main(String[] args) {
        System.out.print("Enter the side: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
    }
    public static double area(double side){
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
