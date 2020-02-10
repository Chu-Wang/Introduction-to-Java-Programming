package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 11:27
 */
public class Exercise05_44 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        short value = input.nextShort();
        short mask = 1;
        System.out.print("The 16 bits are ");
        for(short i = 15; i >= 0; i--){
            short temp = (short) (value >> i);
            short bit = (short) (mask & temp);
            System.out.print(bit);
        }

    }
}
