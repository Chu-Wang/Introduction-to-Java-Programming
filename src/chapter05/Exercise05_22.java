package chapter05;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-09 16:04
 */
public class Exercise05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter loan amount
        System.out.print("Enter loan amount, for example 120000.95: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter number of years as an integer, for example 5: ");
        int numOfYears = input.nextInt();

        System.out.print("Enter yearly interest rate, for example 8.25: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount*monthlyInterestRate /
                (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));

        double balance = loanAmount;
        double interest;
        double principal;

        System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100) / 100.0 );
        System.out.println("Total Payment: " + (int)(monthlyPayment * 12 * numOfYears * 100) / 100.0 + "\n" );

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <= numOfYears * 12; i++) {
            interest = (int)(monthlyInterestRate * balance * 100) / 100.0;
            principal = (int)((monthlyPayment - interest) * 100) / 100.0;
            balance = (int)((balance - principal) * 100) / 100.0;
            System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
        }

    }
}
