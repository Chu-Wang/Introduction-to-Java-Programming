package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 10:32
 */
public class Exercise06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the polygon is " + area(n, side));

    }
    public static double area(int n, double side){
        return (double)(n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
