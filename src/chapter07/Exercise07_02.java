package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 13:45
 */
public class Exercise07_02 {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 9; i >= 0; i--){
            nums[i] = input.nextInt();
        }
        System.out.print("Reverse numbers of the input is: ");
        for(int i = 0; i < 10; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
