package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 10:24
 */
public class Exercise06_37 {
    public static void main(String[] args) {
        System.out.print("Enter a number and width: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int width = input.nextInt();
        System.out.println(format(number, width));

    }
    public static String format(int number, int width){
        String str = Integer.toString(number);
        if(str.length() >= width){
            return str;
        }
        while(str.length() < width){
            str = "0" + str;
        }
        return str;
    }
}
