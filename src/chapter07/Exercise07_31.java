package chapter07;

import sun.security.krb5.internal.tools.Klist;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-13 22:56
 */
public class Exercise07_31 {
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
        int[] result = merge(list1, list2);
        System.out.print("The merge list is ");
        for(int i = 0; i < list1.length + list2.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[list1.length + list2.length];
        while(i < list1.length && j < list2.length){
            if(list1[i] < list2[j]){
                result[k] = list1[i];
                k++;
                i++;
            }else{
                result[k] = list2[j];
                k++;
                j++;
            }
        }
        if(i < list1.length){
            for(int m = k; m < list1.length + list2.length; m++, i++){
                result[m] = list1[i];
            }
        }
        if(j < list2.length){
            for(int m = k; m < list1.length + list2.length; m++, j++){
                result[m] = list2[j];
            }
        }
        return result;
    }
}
