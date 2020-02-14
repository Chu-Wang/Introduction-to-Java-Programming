package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-13 22:14
 */
public class Exercise07_28 {
    public static void main(String[] args) {
        final int NUMBER = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] list = new int[NUMBER];
        for(int i = 0; i < NUMBER; i++){
            list[i] = input.nextInt();
        }
        for(int i = 0; i < NUMBER; i++){
            for(int j = i + 1; j < NUMBER; j++){
                System.out.println("(" + list[i] + "," + list[j] + ")");
            }
        }

    }

}
