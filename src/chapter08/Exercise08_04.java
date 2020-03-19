package chapter08;

/**
 * @author WangMingMing
 * @creat 2020-03-03 10:04
 */
public class Exercise08_04 {
    public static void main (String [] args) {
        int x = 1;
        System.out.print((x > 1) & (x++ > 1));
        System.out.print("");
        System.out.print((x > 1) && (x++ > 1));
    }

}
