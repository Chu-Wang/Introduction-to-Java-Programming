package chapter07;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-13 22:02
 */
public class Exercise07_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int numberOfList1 = input.nextInt();
        int[] list1 = new int[numberOfList1];
        for(int i = 0; i < numberOfList1; i++){
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int numberOfList2 = input.nextInt();
        int[] list2 = new int[numberOfList2];
        for(int i = 0; i < numberOfList2; i++){
            list2[i] = input.nextInt();
        }
        if(equals(list1,list2)){
            System.out.println("Two lists are strictly identical");
        }else{
            System.out.println("Two lists are not strictly identical");
        }

    }
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length != list2.length){
            return false;
        }
        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}
