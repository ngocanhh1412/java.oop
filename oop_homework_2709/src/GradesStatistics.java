import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input size
        System.out.print("Enter the number of students: ");
        int size = in.nextInt();

        //input value
        int[] array = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter the the grade for student " + i + ": ");
            array[i - 1] = in.nextInt();
        }

        //average
        int sum = 0;
        for (int j = 0; j < size; j++) {
            sum += array[j];
        }
        double average = (double) sum / size;
        System.out.println("The average is: " + average);

        //minimum
        int minimum = array[0];
        for (int j = 0; j < size; j++) {
            if (array[j] < minimum) {
                minimum = array[j];
            }
        }
        System.out.println("The minimum is: " + minimum);

        //maximum
        int maximum = array[0];
        for (int j = 0; j < size; j++) {
            if (array[j] > maximum) {
                maximum = array[j];
            }
        }
        System.out.println("The minimum is: " + maximum);
    }
}

