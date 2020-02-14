package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-13 12:01
 */
public class Exercise07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();
        int[] slots = new int[numberOfSlots];
        for(int i = 0; i < numberOfBalls; i++){
            slots[onePath(numberOfSlots)]++;
        }
        displayElements(slots);
    }

    public static int onePath(int numberOfSlots) {
        int position = 0;//用来记录R出现的次数
        for (int i = 0; i < numberOfSlots - 1; i++)
            if (Math.random() < 0.5) {
                System.out.print("L");
            }
            else {
                System.out.print("R");
                position++;
            }

        System.out.println();
        return position;
    }
    public static int max(int[] slots){
        int result = 0;
        for(int i = 0; i < slots.length; i++){
            if(result < slots[i]){
                result++;
            }
        }
        return result;
    }

    public static void displayElements(int[] slots){
        int row = max(slots);
        for(int i = row; i > 0; i--){
            for(int j = 0; j < slots.length; j++){
                if(slots[j] < i){
                    System.out.print(" ");
                }else{
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
