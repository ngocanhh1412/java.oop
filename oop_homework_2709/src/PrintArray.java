import java.util.Scanner;

public class PrintArray {
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

        //print array
        System.out.print("The values are: [");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[(size - 1)]);
        System.out.print("]");
    }
}
