package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 12:12
 */
public class Exercise05_18b {
    public static void main(String[] args) {
        for(int row = 6; row >= 1; row--){
            for(int num = 1; num <= row; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
