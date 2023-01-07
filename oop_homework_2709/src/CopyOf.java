import java.util.Scanner;

public class CopyOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input size
        System.out.print("Enter the number of items: ");
        int size = in.nextInt();

        //input value
        int[] array = new int[size];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        print(copyOf(array));
        System.out.println();

        //input new length
        System.out.print("Enter the new length: ");
        int newLength = in.nextInt();

        print(copyOf(array, newLength));
    }

    public static int[] copyOf(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArray = new int[newLength];

        if (newLength > array.length) {
            for (int i = 0; i < newLength; i++) {
                if (i < array.length) {
                    newArray[i] = array[i];
                } else {
                    newArray[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < newLength; i++) {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[(array.length - 1)]);
        System.out.print("]");
    }
}