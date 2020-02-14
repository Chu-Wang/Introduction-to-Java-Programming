package chapter07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-13 22:42
 */
public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int number = input.nextInt();
        System.out.print("Enter the values: ");
        int[] list = new int[number];
        for(int i = 0; i < number; i++){
            list[i] = input.nextInt();
        }
        if(isConsecutiveFour(list)){
            System.out.println("The list has consecutive fours");
        }else{
            System.out.println("The list has no consecutive fours");
        }

    }
    public static boolean isConsecutiveFour(int[] values){
        for(int i = 0; i < values.length - 3; i++){
            boolean isEqual = true;
            for(int j = i; j < i + 3; j++){
                if (values[j] != values[j + 1]) {
                    isEqual = false;
                    break;
                }
            }
            if(isEqual) return true;
        }
        return false;
    }
}
