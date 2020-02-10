package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 12:30
 */
public class Exercise05_38 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        String result = "";
        while(decimal != 0){
            int digit = decimal % 8;
            result = digit + result;
            decimal /= 8;
        }
        System.out.println(result);
    }
}
