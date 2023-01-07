import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input key
        System.out.print("Enter the key: ");
        int key = in.nextInt();

        //input size
        System.out.print("Enter the number of items: ");
        int size = in.nextInt();

        //input value
        int[] array = new int[size];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(search(array, key));
    }


    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return array[i];
            }
        }
        return -1;
    }
}
