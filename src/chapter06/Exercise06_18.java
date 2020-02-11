package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 20:34
 */
public class Exercise06_18 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if(isValidPassword(s)){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
    public static boolean isValidPassword(String str){
        int count = 0;
        //boolean flag = true;
        if(str.length() < 8){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(!Character.isLetterOrDigit(str.charAt(i))) return false;
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        if(count < 2){
            return false;
        }
        return true;
    }
}
