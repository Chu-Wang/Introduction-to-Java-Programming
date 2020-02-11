package chapter06;

/**
 * @author WangMingMing
 * @creat 2020-02-10 22:17
 */
public class Exercise06_26 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2; true; i++){
            if(isPrim(i) && isReverse(i)){
                count++;
                System.out.print((count % 10 != 0) ? i + " " : i + "\n");
                if(count == 100){
                    break;
                }
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

    public static int isEqual(int num){
        int result = 0;
        while(num != 0){
            int digit = num % 10;
            result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }

    public static boolean isReverse(int number){
        return number == isEqual(number);
    }
}
