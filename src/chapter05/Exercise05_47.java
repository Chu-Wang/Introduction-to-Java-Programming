package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 11:00
 */
public class Exercise05_47 {
    public static void main(String[] args) {
        System.out.print("Enter the first 12-digit of an ISBN number as a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if(s.length() != 12){
            System.out.print(s + " is an invalid input");
            System.exit(1);
        }
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                sum = sum + (s.charAt(i) - '0');
            }else{
                sum = sum + (s.charAt(i) - '0') * 3;
            }
        }
        int checkSum = 10 - sum % 10;
        System.out.print("The ISBN number is ");
        System.out.print((checkSum == 10) ? s + 0 : s + checkSum);
    }
}
