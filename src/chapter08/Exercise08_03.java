package chapter08;

/**
 * @author WangMingMing
 * @creat 2020-02-14 13:45
 */
public class Exercise08_03 {
    public static void main (String [] args) {
        int x = 1;
        System.out.print((x > 1) & (x++ > 1));
        System.out.print("");
        System.out.print((x > 1) && (x++ > 1));
    }

}
