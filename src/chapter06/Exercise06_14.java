package chapter06;

/**
 * @author WangMingMing
 * @creat 2019-12-14 20:34
 */
public class Exercise06_14 {
    public static void main(String[] args) {
        System.out.printf("%-20s%-20s\n", "i", "m(i)");
        for (int i = 1; i <= 1000; i += 100)
            System.out.printf("%-20d%-20.4f\n", i, m(i));
    }

    public static double m(int n){
        double pi = 0;
        double sign = 1;
        for(int i = 1; i <= n; i++){
            pi += sign / (2 * i - 1);
            sign = -sign;
        }
        return 4 * pi;
    }
}
