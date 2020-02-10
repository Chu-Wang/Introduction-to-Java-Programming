package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-09 22:52
 */
public class Exercise05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int total = 0;
        /*for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                total++;
            }
        }*/
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                total++;
            }
        }
        System.out.println("The number of uppercase letters is " + total);
    }
}
