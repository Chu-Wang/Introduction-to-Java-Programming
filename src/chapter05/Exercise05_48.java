package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 10:53
 */
public class Exercise05_48 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                System.out.print(s.charAt(i));
            }
        }

    }
}
