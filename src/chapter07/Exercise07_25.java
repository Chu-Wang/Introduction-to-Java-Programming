package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-13 21:54
 */
public class Exercise07_25 {
    public static void main(String[] args) {
        System.out.print("Enter a b c: ");
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        for(int i = 0; i < eqn.length; i++){
            eqn[i] = input.nextDouble();
        }
        double[] roots = new double[2];
        int numberOfRoots = solveQuadratic(eqn, roots);

        if (numberOfRoots == 0)
            System.out.println("The equation has no roots");
        else if (numberOfRoots == 1)
            System.out.println("The equation has one root: " + roots[0]);
        else
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return 0;
        }else if (discriminant == 0) {
            roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            return 1;
        }else {
            roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            roots[1] = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            return 2;
        }

    }
}
