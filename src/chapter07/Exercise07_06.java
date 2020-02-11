package chapter07;

/**
 * @author WangMingMing
 * @creat 2020-02-11 15:22
 */
public class Exercise07_06 {
    public static void main(String[] args) {
        final int NUM_OF_PRIMES = 50;
        int[] primeNumbers = new int[NUM_OF_PRIMES];
        int count = 0;
        int number = 2;
        boolean isPrime = true;
        System.out.println("The first 50 prime numbers are \n");

        while (count < NUM_OF_PRIMES) {
            isPrime = true;

            for (int i = 0; i < count && primeNumbers[i] <= Math.sqrt(number); i++) {
                if (number % primeNumbers[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers[count] = number;
                count++;

                if (count % 10 == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + "\t");
            }
            number++;
        }
    }
}
