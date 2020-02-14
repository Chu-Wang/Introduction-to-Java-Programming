package chapter07;

/**
 * @author WangMingMing
 * @creat 2020-02-13 12:22
 */
public class Exercise07_22 {
    public static void main(String[] args) {
        int[] queens = new int[8];
        for (int i = 0; i < 8; i++){
            queens[i] = -1;
        }
        queens[0] = 0;
        int k = 1;
        while (k >= 0 && k <= 7) {
            int j = findPosition(k, queens);
            if (j < 0) {
                queens[k] = -1;
                k--;
            } else {
                queens[k] = j;
                k++;
            }
        }
        printResult(queens);
    }
    public static int findPosition(int k, int[] queens) {
        int start = queens[k] == -1 ? 0 : queens[k] + 1;
        for (int j = start; j < 8; j++) {
            if (isValid(k, j, queens))
                return j; // (k, j) is the place to put the queen now
        }

        return -1;
    }
    public static boolean isValid(int k, int j, int queens[]) {
        // See if (k, j) is a possible position
        // Check jth column
        for (int i = 0; i < k; i++)
            if (queens[i] == j)
                return false;

        // Check major diagnol
        for (int row = k - 1, column = j - 1; row >= 0 && column >= 0; row--, column--)
            if (queens[row] == column)
                return false;

        // Check minor diagnol
        for (int row = k - 1, column = j + 1; row >= 0 && column <= 7; row--, column++)
            if (queens[row] == column)
                return false;

        return true;
    }
    public static void printResult(int[] queens) {
        for (int i = 0; i < 8; i++)
            System.out.println(i + ", " + queens[i]);
        System.out.println();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < queens[i]; j++)
                System.out.print("| ");
            System.out.print("|Q|");
            for (int j = queens[i] + 1; j < 8; j++)
                System.out.print(" |");
            System.out.println();
        }
    }


}
