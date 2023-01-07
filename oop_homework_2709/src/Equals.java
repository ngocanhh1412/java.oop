import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input size
        System.out.print("Enter the size of array 1: ");
        int size1 = in.nextInt();

        System.out.print("Enter the size of array 2: ");
        int size2 = in.nextInt();

        //input value
        int[] array1 = new int[size1];
        System.out.print("Enter the items of array 1 (separated by space): ");
        for (int i = 0; i < size1; i++) {
            array1[i] = in.nextInt();
        }

        int[] array2 = new int[size2];
        System.out.print("Enter the items of array 2 (separated by space): ");
        for (int i = 0; i < size2; i++) {
            array2[i] = in.nextInt();
        }

        System.out.println(equals(array1, array2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
