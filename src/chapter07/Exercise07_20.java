package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-13 11:49
 */
public class Exercise07_20 {
    public static void main(String[] args) {
        System.out.print("Enter ten double numbers: ");
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextDouble();
        }
        selectionSort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void selectionSort(double[] list){
        for(int i = list.length - 1; i >= 0; i--){
            double currentMax = list[i];
            int currentIndexMax = i;
            for(int j = i - 1; j >= 0; j--){
                if(currentMax < list[j]){
                    currentMax = list[j];
                    currentIndexMax = j;
                }
            }
            if(currentIndexMax != i){
                list[currentIndexMax] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
