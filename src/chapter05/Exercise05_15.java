package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-08 22:01
 */
public class Exercise05_15 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = '!'; i <= '~'; i++){
            System.out.print((count++ % 10 != 0) ? (char)i + " " : (char)i + "\n");
        }
    }
}
