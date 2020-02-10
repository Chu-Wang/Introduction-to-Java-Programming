package chapter05;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 10:46
 */
public class Exercise05_49 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int countVowels = 0;
        int countConsonants = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = Character.toUpperCase(s.charAt(i));
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                countVowels++;
            }else if(Character.isLetter(ch)){
                countConsonants++;
            }
        }
        System.out.println("The number of vowels is " + countVowels);
        System.out.println("The number of consonants is " + countConsonants);
    }
}
