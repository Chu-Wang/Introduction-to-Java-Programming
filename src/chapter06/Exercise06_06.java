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
        for(int i = 1; i <= n; i++){
            for(int cap = 1; cap <= n - i; cap++){
                System.out.print("    ");
            }
            for(int num = i; num >= 1; num--){
                System.out.printf("%-4d", num);
            }
            System.out.println();
        }
    }
}
