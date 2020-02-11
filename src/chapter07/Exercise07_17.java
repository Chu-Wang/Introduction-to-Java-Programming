package chapter07;

import com.sun.media.sound.InvalidFormatException;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 18:15
 */
public class Exercise07_17 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[] students = new String[num];
        double[] scores = new double[num];
        for(int i = 0; i < num; i++){
            System.out.print("Enter a student name: ");
            students[i] = input.next();
            System.out.print("Enter a student score: ");
            scores[i] = input.nextDouble();
        }
        //选择排序
        for(int i = 0; i < num - 1; i++){
            double currentMinScore = scores[i];
            int currentMinIndex = i;
            for(int j = i + 1; j < num; j++){
                if(scores[j] < currentMinScore){
                    currentMinScore = scores[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                scores[currentMinIndex] = scores[i];
                scores[i] = currentMinScore;
                String temp = students[currentMinIndex];
                students[currentMinIndex] = students[i];
                students[i] = temp;
            }
        }

        for(int i = num - 1; i >= 0; i--){
            System.out.println(students[i] + "\t" + scores[i]);
        }
    }
}
