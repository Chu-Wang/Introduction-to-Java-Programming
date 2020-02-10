package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 21:54
 */
public class Exercise05_25 {
    public static void main(String[] args) {
        double pi = 1;
        double sign = 1;
        for (int i = 2; i <= 100000; i++) {
            sign = -sign;
            pi += sign / (2 * i - 1.0);
            if (i % 10000 == 0){
                System.out.println("i: " + i + " The PI is " + 4 * pi);
            }
        }
    }
}
