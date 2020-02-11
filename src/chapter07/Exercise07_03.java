package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 13:49
 */
public class Exercise07_03 {
    public static void main(String[] args) {
        System.out.print("Enter the integers 1 and 100: ");
        Scanner input = new Scanner(System.in);
        int[] count = new int[101];
        int num = input.nextInt();
        while(num != 0){
            count[num]++;
            num = input.nextInt();
        }
        for(int i = 1; i <= 100; i++){
            if(count[i] != 0){
                System.out.println(i + " occurs " + count[i] + ((count[i] == 1) ? " time" : " times"));
            }
        }
    }
}
