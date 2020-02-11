package chapter07;

/**
 * @author WangMingMing
 * @creat 2020-02-11 15:43
 */
public class Exercise07_07 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i = 0; i < 100; i++){
            int num = (int)(Math.random() * 10);
            nums[num]++;
        }
        for(int i = 0; i < 10; i++){
            if(nums[i] > 0){
                System.out.println("Count for " + i + " is " + nums[i]);
            }
        }


    }
}
