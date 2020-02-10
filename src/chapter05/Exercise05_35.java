package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-10 15:34
 */
public class Exercise05_35 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 624; i++){
            sum = sum + (1.0 / (Math.pow(i, 0.5) + Math.pow((i + 1), 0.5)));
        }
        System.out.println(sum);
    }
}
