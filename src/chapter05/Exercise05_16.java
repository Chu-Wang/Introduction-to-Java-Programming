package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-08 22:08
 */
public class Exercise05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.println("The factors for " + number + " is");
        int factor = 2;
        while(number >= factor){
            if(number % factor == 0){
                System.out.print(factor + " ");
                number /= factor;
            }else{
                factor++;
            }
        }
    }
}
