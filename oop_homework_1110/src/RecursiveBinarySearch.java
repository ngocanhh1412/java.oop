import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the value: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = in.nextInt();

        int fromIdx = 0;
        int toIdx = size;

        System.out.println(binarySearch(array, key, fromIdx, toIdx));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else return false;
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;

            if (key == array[fromIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }
}
