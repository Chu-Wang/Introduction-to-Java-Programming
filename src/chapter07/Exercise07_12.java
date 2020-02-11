package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 16:50
 */
public class Exercise07_12 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextInt();
        }
        nums = reverse(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static int[] reverse(int[] list){
        for(int i = 0, j = list.length - 1; i < j; i++, j--){
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        return list;
    }
}
