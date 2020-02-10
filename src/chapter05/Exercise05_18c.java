package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 12:14
 */
public class Exercise05_18c {
    public static void main(String[] args) {
        for(int row = 1; row <= 6; row++){
            for(int cap = 6 - row; cap >= 1; cap--){
                System.out.print("  ");
            }
            for(int num = row; num >= 1; num--){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
}
