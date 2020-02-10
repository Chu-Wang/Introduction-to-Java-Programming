package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 21:34
 */
public class Exercise05_24 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 97; i += 2){
            sum = sum + 1.0 * i / (i + 2);
        }
        System.out.println(sum);
    }
}
