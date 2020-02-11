package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 21:22
 */
public class Exercise06_23 {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        System.out.print(count(s, ch));
    }
    public static int count(String str, char a){
        int numOfA = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a){
                numOfA++;
            }
        }
        return numOfA;
    }
}
