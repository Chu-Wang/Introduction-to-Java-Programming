package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 17:50
 */
public class Exercise07_15 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextInt();
        }
        int[] result = eliminateDuplicates(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] numbers){
        int[] temp = new int[numbers.length];
        int size = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isInArray = false;
            for (int j = 0; j < i && !isInArray; j++){
                if (numbers[j] == numbers[i]) {
                    isInArray = true;
                }
            }
            if (!isInArray) {
                temp[size] = numbers[i];
                size++;
            }
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] =temp[i];
        }
        return result;

    }
}
