package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-09 12:53
 */
public class Exercise05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount, for example 120000.95: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter number of years as an integer, \nfor example 5: ");

        int numOfYears = input.nextInt();

        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 1.0 / 8) {

            double monthlyInterestRate = annualInterestRate / 1200;

            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
            double totalPayment = monthlyPayment * numOfYears * 12;

            System.out.printf("%5.3f%c %20.2f %20.2f\n", annualInterestRate, '%', monthlyPayment, totalPayment);
        }
    }
}
