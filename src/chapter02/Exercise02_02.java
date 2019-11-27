package chapter02;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-11-27 22:10
 */
public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
