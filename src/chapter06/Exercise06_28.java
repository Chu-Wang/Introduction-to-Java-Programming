package chapter06;

/**
 * @author WangMingMing
 * @creat 2020-02-11 11:02
 */
public class Exercise06_28 {
    public static void main(String[] args) {
        System.out.printf("%-5c%-10s\n", 'p', "2^p - 1");
        for(int p = 2; p <= 31; p++){
            int num = (int)(Math.pow(2, p) - 1);
            if(isPrim(num)){
                System.out.printf("%-5d%-10d\n", p, num);
            }
        }
    }
    public static boolean isPrim(int num){
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
