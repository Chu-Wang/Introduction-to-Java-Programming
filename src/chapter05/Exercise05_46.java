package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 11:09
 */
public class Exercise05_46 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String result = "";
        for(int i = s.length() - 1; i >= 0; i--){
            result = result + s.charAt(i);
        }
        System.out.print("The reversed string is " + result);
    }
}
