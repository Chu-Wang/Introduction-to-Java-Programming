package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 20:57
 */
public class Exercise06_20 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("The number of Letters is : " + countLetters(str));
    }
    public static int countLetters(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
