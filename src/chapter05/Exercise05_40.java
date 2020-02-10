package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-10 11:42
 */
public class Exercise05_40 {
    public static void main(String[] args) {
        int count1 = 0;//正面
        int count2 = 0;//反面
        for(int i = 0; i < 1000000; i++){
            int num = (int)(Math.random() * 2);
            if(num == 0){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println("正面次数: " + count1);
        System.out.println("反面次数: " + count2);


    }
}
