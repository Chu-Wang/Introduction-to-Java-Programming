package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-10 11:37
 */
public class Exercise05_43 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 7; i++){
            for(int j = i + 1; j <= 7; j++){
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
