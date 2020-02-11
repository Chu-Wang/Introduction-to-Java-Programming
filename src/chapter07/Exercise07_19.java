package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 20:29
 */
public class Exercise07_19 {
    public static void main(String[] args) {
        System.out.print("Enter a number and list: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] nums = new int[number];
        for(int i = 0; i < number; i++){
            nums[i] = input.nextInt();
        }
        if(isSorted(nums)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }
    public static boolean isSorted(int[] list){
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] > list[i + 1]){
                return false;
            }
        }
        return true;
    }
}
