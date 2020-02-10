package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 17:05
 */
public class Exercise05_23 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        for(int i = 1; i <= 50000; i++){
            sum1 = sum1 + 1.0 / i;
        }
        for(int i = 50000; i >= 1; i--){
            sum2 = sum2 + 1.0 / i;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
