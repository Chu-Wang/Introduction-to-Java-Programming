package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-14 11:16
 */
public class Exercise07_33 {
    public static void main(String[] args) {
        String[] animals = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(year >= 1900){
            year -= 1900;
        }else{
            year = 1900 - year;
        }
        System.out.println(animals[year % 12]);
    }
}
