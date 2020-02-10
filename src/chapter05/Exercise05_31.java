package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-10 15:55
 */
public class Exercise05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();//输入总金额
        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = input.nextDouble();//年利率
        double monthlyInterestRate = annualInterestRate / 1200;//月利率

        System.out.print("Enter maturity period (number of months): ");
        double numberOfMonths = input.nextInt();//月数

        System.out.print("Month\t\tCD Value\n");
        double currentValue = deposit;
        for(int i = 1; i <= numberOfMonths; i++){
            currentValue = currentValue * (1 + monthlyInterestRate);
            System.out.printf("%-5d%15.2f\n", i, currentValue);
        }
    }
}
