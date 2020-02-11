package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 21:44
 */
public class Exercise06_25 {
    public static void main(String[] args) {
        System.out.print("Enter time in milliseconds: ");
        Scanner input = new Scanner(System.in);
        long totalMilliseconds = input.nextLong();

        System.out.println(convertMillis(totalMilliseconds));
    }
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;

        int seconds = (int)(totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        int minutes = (int)(totalMinutes % 60);

        long hours = totalMinutes / 60;

        return hours + ":" + minutes + ":" + seconds;
    }
}
