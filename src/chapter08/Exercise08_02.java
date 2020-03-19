package chapter08;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-14 13:39
 */
public class Exercise08_02 {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double[][] nums = new double[4][4];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(nums));
    }
    public static double sumMajorDiagonal(double[][] m){
        double result = 0;
        for(int i = 0; i < m.length; i++){
            result = result + m[i][i];
        }
        return result;
    }
}
