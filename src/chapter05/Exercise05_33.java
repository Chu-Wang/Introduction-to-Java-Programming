package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-10 15:44
 */
public class Exercise05_33 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10000; i++){
            int sum = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0 && i != j){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
