package chapter07;

/**
 * @author WangMingMing
 * @creat 2020-02-14 11:06
 */
public class Exercise07_32 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        partition(list);

        System.out.print("After the partition, the list is ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
    public static int partition(int[] list) {
        int first = 0;
        int last = list.length - 1;
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot)
                low++;

            while (low <= high && list[high] > pivot)
                high--;

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

}
