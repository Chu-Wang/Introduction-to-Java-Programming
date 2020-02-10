package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 12:25
 */
public class Exercise05_18d {
    public static void main(String[] args) {
        for(int row = 6; row >= 1; row--){
            for(int cap = 1; cap <= 6 - row; cap++){
                System.out.print("  ");
            }
            for(int num = 1; num <= row; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
