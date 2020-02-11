package chapter07;

import java.util.Arrays;

/**
 * @author WangMingMing
 * @creat 2020-02-11 18:03
 */
public class Exercise07_16 {
    public static void main(String[] args) {
        int[] nums = new int[100000];
        for(int i = 0; i < 100000; i++){
            nums[i] = (int)(Math.random() * 100000);
        }
        int key = (int)(Math.random() * 100000);
        long startTime = System.currentTimeMillis();
        System.out.println(linearSearch(nums, key));
        long endTime = System.currentTimeMillis();
        long executionTime = startTime - endTime;
        System.out.println(executionTime);

        Arrays.sort(nums);
        startTime = System.currentTimeMillis();
        System.out.println(binarySearch(nums, key));
        endTime = System.currentTimeMillis();
        executionTime = startTime - endTime;
        System.out.println(executionTime);

    }
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while(high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
            }else if(key > list[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -low - 1;
    }
}
