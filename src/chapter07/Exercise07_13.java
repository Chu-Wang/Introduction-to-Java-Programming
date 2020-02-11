package chapter07;

/**
 * @author WangMingMing
 * @creat 2020-02-11 17:00
 */
public class Exercise07_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1, 2, 3, 10));
    }
    public static int getRandom(int... numbers){
        int num = (int)(Math.random() * 54 + 1);
        while(!isInArray(num, numbers)){
            num = (int)(Math.random() * 54 + 1);
        }
        return num;

    }
    public static boolean isInArray(int num, int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(num == numbers[i]){
                return false;
            }
        }
        return true;
    }
}
