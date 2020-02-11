package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 13:28
 */
public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        System.out.print("Enter " + num + " scores: ");
        double[] scores = new double[num];
        double best = Double.MIN_VALUE;
        for(int i = 0; i < num; i++){
            scores[i] = input.nextDouble();
            if(scores[i] >= best){
                best = scores[i];
            }
        }
        for(int i = 0; i < num; i++){
            display(i, scores[i], best);
        }
    }
    public static void display(int i, double score, double best){
        if(score >= (best - 10)){
            System.out.println("Student " + i + " score is " + score + " and grade is A");
        }else if(score >= (best - 20)){
            System.out.println("Student " + i + " score is " + score + " and grade is B");
        }else if(score >= (best - 30)){
            System.out.println("Student " + i + " score is " + score + " and grade is C");
        }else if(score >= (best - 40)){
            System.out.println("Student " + i + " score is " + score + " and grade is D");
        }else{
            System.out.println("Student " + i + " score is " + score + " and grade is F");
        }
    }
}
