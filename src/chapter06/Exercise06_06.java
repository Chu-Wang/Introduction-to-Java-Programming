package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2019-12-14 20:09
 */
public class Exercise06_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line number: ");
        int number = scanner.nextInt();

        displayPattern(number);

    }
    public static void displayPattern(int n){
        for(int row = 1; row <= n; row++){
            for(int i = row; i < n; i++){
                System.out.print("  ");
            }
            for(int i = row; i >= 1; i--){
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
