package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 15:51
 */
public class Exercise05_32 {
    public static void main(String[] args) {
        int first = (int)(Math.random() * 10);
        int second = (int)(Math.random() * 10);
        while(second == first){
            second = (int)(Math.random() * 10);
        }
        System.out.print("Enter your two digits lottery pick: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if(guess / 10 == first && guess % 10 == second){
            System.out.println("Exact match: you win $10,000");
        }else if(guess / 10 == second && guess % 10 == first){
            System.out.println("Match all digits: you win $3,000");
        }else if(guess / 10 == first || guess / 10 == second || guess % 10 == first || guess % 10 == second){
            System.out.println("Match one digit: you win $1,000");
        }else{
            System.out.println("Sorry, no match");
        }

        System.out.println("Lottery is " + first + second);
    }
}
