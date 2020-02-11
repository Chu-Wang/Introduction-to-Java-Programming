package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 20:17
 */
public class Exercise07_18 {
    public static void main(String[] args) {
        System.out.print("Enter ten number: ");
        double[] list = new double[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            list[i] = input.nextDouble();
        }
        list = bubbleSort(list);
        System.out.println("The list is already sorted");
        display(list);
    }
    public static double[] bubbleSort(double[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void display(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
