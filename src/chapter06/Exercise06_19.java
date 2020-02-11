package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 20:46
 */
public class Exercise06_19 {
    public static void main(String[] args) {
        System.out.print("Enter three sids in double: ");
        Scanner input = new Scanner(System.in);
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        if(MyTriangle.isValid(edge1, edge2, edge3)){
            double area = MyTriangle.area(edge1, edge2, edge3);
            System.out.println("The are of the triangle is " + area);
        }else{
            System.out.println("Input is invalid");
        }

    }
}

class MyTriangle{
    public static boolean isValid(double side1, double side2, double side3){
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
