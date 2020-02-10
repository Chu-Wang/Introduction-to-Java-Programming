package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-08 21:54
 */
public class Exercise05_13 {
    public static void main(String[] args) {
        int i = 1;
        while (i * i * i < 12000) {
            i++;
        }
        // i^3 >= 12000
        // (i-1)^3 < 12000
        System.out.println("This number is " + (i - 1));
    }
}
