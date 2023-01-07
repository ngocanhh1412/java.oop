import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the value: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int max = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > max) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = max;
        }

        //print
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}