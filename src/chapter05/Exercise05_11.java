package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-08 17:45
 */
public class Exercise05_11 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 100; i <= 200; i++){
            if((i % 5 == 0) ^ (i % 6 == 0)){
                System.out.print((count++ % 10 != 0) ? i + " " : i + "\n");
            }
        }
    }
}
