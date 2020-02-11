package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 15:55
 */
public class Exercise07_09 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        double[] nums = new double[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(nums));
    }
    public static double min(double[] array){
        double result = Double.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] <= result){
                result = array[i];
            }
        }
        return result;
    }
}
