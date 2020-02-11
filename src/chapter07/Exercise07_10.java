package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 16:00
 */
public class Exercise07_10 {
    public static void main(String[] args) {
        double[] nums = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextDouble();
        }
        System.out.println("The smallest number's index is: " + indexOfSmallestElement(nums));
    }
    public static int indexOfSmallestElement(double[] array){
        double min = Double.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
