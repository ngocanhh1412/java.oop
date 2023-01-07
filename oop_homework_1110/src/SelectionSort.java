import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the value: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        selectionSort(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[max]) {
                    max = j;
                }
            }

            int temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }

        //print
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
