package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 15:47
 */
public class Exercise07_08 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] numsOfDouble = new double[10];
        for(int i = 0; i < 10; i++){
            numsOfDouble[i] = input.nextDouble();
        }
        System.out.println(average(numsOfDouble));
    }
    public static int average(int[] array){
        int result = 0;
        for(int i = 0; i < array.length; i++){
            result += array[i];
        }
        int averageOfInteger = result / array.length;
        return averageOfInteger;
    }
    public static double average(double[] array){
        double result = 0;
        for(int i = 0; i < array.length; i++){
            result += array[i];
        }
        double averageOdDouble = result / array.length;
        return averageOdDouble;
    }
}
