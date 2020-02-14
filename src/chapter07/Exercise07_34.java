package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-14 11:19
 */
public class Exercise07_34 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("Sorted string is " + sort(s));
    }
    public static String sort(String s) {
        StringBuilder buffer = new StringBuilder(s);

        char currentMax;
        int currentMaxIndex;

        for (int i = buffer.length() - 1; i >= 1; i--) {
            currentMax = buffer.charAt(i);
            currentMaxIndex = i;

            for (int j = 1; j <= i; j++) {
                if (currentMax < buffer.charAt(j)) {
                    currentMax = buffer.charAt(j);
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                buffer.setCharAt(currentMaxIndex, buffer.charAt(i));
                buffer.setCharAt(i, currentMax);
            }
        }

        return buffer.toString();
    }
}
