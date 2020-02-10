package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-09 22:25
 */
public class Exercise05_27 {
    public static void main(String[] args) {
        int count = 0;
        for(int year = 101; year <= 2100; year++){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                count++;
                System.out.print((count % 10 != 0) ? year + " " : year + "\n");
            }
        }
        System.out.println("数目是：" + count);
    }
}
