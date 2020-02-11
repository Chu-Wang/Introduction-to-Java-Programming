package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 16:08
 */
public class Exercise07_11 {
    public static void main(String[] args) {
        double[] nums = new double[10];
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextDouble();
        }
        System.out.println("The mean is " + mean(nums));
        System.out.println("The standard deviation is " + deviation(nums));
    }
    public static double deviation(double[] x){
        double sum = 0;
        double average = mean(x);
        for(int i = 0; i < x.length; i++){
            sum = sum + Math.pow(x[i] - average, 2);
        }
        double result = Math.pow(sum / (x.length - 1), 0.5);
        return result;
    }
    public static double mean(double[] x){
        double result = 0;
        for(int i = 0; i < x.length; i++){
            result += x[i];
        }
        return result / x.length;
    }
}
