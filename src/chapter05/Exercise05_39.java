package chapter05;

/**
 * @author WangMingMing
 * @creat 2020-02-10 11:46
 */
public class Exercise05_39 {
    public static void main(String[] args) {
        final double COMMISSION_SOUGHT = 30000;
        final double INITIAL_SALES_AMOUNT = 0.01;
        double commission = 0;
        double salesAmount = INITIAL_SALES_AMOUNT;

        do {
            salesAmount += 0.01;
            if (salesAmount >= 10000.01)
                commission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
            else if (salesAmount >= 5000.01)
                commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
            else
                commission = salesAmount * 0.08;
        } while (commission < COMMISSION_SOUGHT);

        // Display the sales amount
        System.out.println("The sales amount $" + (int)(salesAmount * 100) / 100.0 + " is needed to make a commission of $" + COMMISSION_SOUGHT);
    }
}
