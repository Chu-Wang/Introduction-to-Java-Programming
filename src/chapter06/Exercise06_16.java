package chapter06;

/**
 * @author WangMingMing
 * @creat 2020-02-10 18:48
 */
public class Exercise06_16 {
    public static void main(String[] args) {
        for(int i = 2000; i <= 2020; i++){
            System.out.println(i + "年有" + numberOfDaysInAYear(i) + "天");
        }
    }
    public static int numberOfDaysInAYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return 366;
        }else{
            return 365;
        }
    }
}
