package chapter06;

/**
 * @author WangMingMing
 * @creat 2020-02-11 11:11
 */
public class Exercise06_29 {
    public static void main(String[] args) {
        for(int i = 2; i < 1000; i++){
            if(isPrim(i) && isPrim(i + 2)){
                System.out.println("(" + i + "," + (i + 2) +")");
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
