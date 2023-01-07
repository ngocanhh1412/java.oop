import java.util.Scanner;

public class Print {
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

        print(array);
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
