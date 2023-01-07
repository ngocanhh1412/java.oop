import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        int number;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {
            if (hasEight(number) == true) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        while (number != 0) {
            int remainder = number % 10;
            if (remainder == 8) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }

}
