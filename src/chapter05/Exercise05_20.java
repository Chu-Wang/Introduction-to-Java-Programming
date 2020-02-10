package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 12:40
 */
public class Exercise05_20 {
    public static void main(String[] args) {
        int count = 0;
        for(int number = 2; number <= 1000; number++){
            boolean flag = true;
            for(int divisor = 2; divisor <= Math.sqrt(number); divisor++){
                if(number % divisor == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.print((count % 10 != 0) ? number + " " : number + "\n");
            }
        }
    }
}
