package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 12:17
 */
public class Exercise05_41 {
    public static void main(String[] args) {
        System.out.print("Enter an integer (0 ends the input): ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if(value == 0){
            System.out.println("No numbers are entered except 0");
        }
        int maxNum = value;
        int count = 1;
        while(value != 0){
            value = input.nextInt();
            if(value > maxNum){
                maxNum = value;
                count = 1;
            }else if(value == maxNum){
                count++;
            }
        }
        System.out.println("maxNum is " + maxNum);
        System.out.println("The count for the max number is " + count);
    }
}
