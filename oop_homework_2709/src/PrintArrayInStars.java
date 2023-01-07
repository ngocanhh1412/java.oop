import java.util.Scanner;

public class PrintArrayInStars {
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
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":");

            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }

            System.out.print("(" + array[i] + ")");
            System.out.println();
        }
    }
}
