package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 20:29
 */
public class Exercise06_17 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printMatrix(n);
   }
    public static void printMatrix(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int num = (int)(Math.random() * 2);
                System.out.printf("%2d", num);
            }
            System.out.println();
        }
    }
}
