package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 12:08
 */
public class Exercise05_18a {
    public static void main(String[] args) {
        for(int row = 1; row <= 6; row++){
            for(int num = 1; num <= row; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
