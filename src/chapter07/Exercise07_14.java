package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 17:07
 */
public class Exercise07_14 {
    public static void main(String[] args) {
        System.out.print("Enter five numbers: ");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i < 5; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(gcd(nums));
    }
    public static int gcd(int number1, int number2){
        int gcd = 1;
        int k = 1;
        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
    public static int gcd(int... numbers){
        int gcd = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            gcd = gcd(gcd, numbers[i]);
        }
        return gcd;
    }
}
