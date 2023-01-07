import java.util.Scanner;

public class ArrayToString {
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

        System.out.println(arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + ", ";
        }
        str += array[(array.length - 1)];
        str += "]";

        return str;
    }
}
