import java.util.Scanner;

public class LinearSearch {
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

        System.out.println(linearSearch(array, key));
        System.out.println(linearSearchIndex(array, key));

    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }
}
