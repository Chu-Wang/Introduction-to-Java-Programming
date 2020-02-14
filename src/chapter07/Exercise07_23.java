package chapter07;

/**
 * @author WangMingMing
 * @creat 2020-02-13 20:58
 */
public class Exercise07_23 {
    public static void main(String[] args) {
        String[] lockers = new String[100];
        closeAllLockers(lockers);
        studentLockerChanges(lockers);
        print(lockers);

    }
    public static boolean isOpen(String s){
        return "OPEN".equals(s);
    }

    public static void closeAllLockers(String[] lockers){
        for(int i = 0; i < lockers.length; i++){
            lockers[i] = "ClOSE";
        }
    }

    public static void studentLockerChanges(String[] lockers) {
        int start = 0;
        for (int s = 1; s <= lockers.length; s++) {
            for (int l = 0; l < lockers.length; l += s) {
                if (isOpen(lockers[l]))
                    lockers[l] = "CLOSED";
                else
                    lockers[l] = "OPEN";
            }
            start++;
        }
    }

    public static void print(String[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (isOpen(lockers[i])) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
        System.out.println();
    }
}
