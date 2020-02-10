package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 12:27
 */
public class Exercise05_19 {
    public static void main(String[] args) {
        for(int row = 1; row <= 8; row++){
            for(int cap = 1; cap <= 8 - row; cap++){
                System.out.print("    ");
            }
            int num = 1;
            for(int colrow = 1; colrow <= row; colrow++){
                System.out.printf("%4d",num);
                num *= 2;
            }
            num /= 4;
            for(int colrow = 1; colrow <= row - 1; colrow++){
                System.out.printf("%4d",num);
                num /= 2;
            }
            System.out.println();
        }
    }
}
