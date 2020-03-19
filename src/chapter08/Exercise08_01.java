package chapter08;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-14 13:30
 */
public class Exercise08_01 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double[][] nums = new double[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                nums[i][j] = input.nextDouble();
            }
        }
        for(int i = 0; i < 4; i++){
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(nums, i));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double result = 0;
        for(int i = 0; i < m.length; i++){
            result = result + m[i][columnIndex];
        }
        return result;
    }
}
