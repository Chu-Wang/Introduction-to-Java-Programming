package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 21:08
 */
public class Exercise06_22 {
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print("The square root for " + n + " is " + sqrt(n));
    }
    public static double sqrt(long n){
        double nextGuess = 1.0;
        double lastGuess;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) * 0.5;
        }
        while (Math.abs(nextGuess - lastGuess) >= 0.00001);
        return nextGuess;
    }
}
