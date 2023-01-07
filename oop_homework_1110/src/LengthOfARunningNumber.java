import java.util.Scanner;

public class LengthOfARunningNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        System.out.print("S(" + n + ")= ");
        System.out.println(runningNumber(n));

        System.out.print("Length is: " + len(n));
    }

    public static String runningNumber(int n) {
        String num = "";
        for (int i = 1; i <= n; i++) {
            num += String.valueOf(i);
        }
        return num;
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + numOfDigits(n);
    }

    public static int numOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
