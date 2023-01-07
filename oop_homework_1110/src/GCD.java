import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number A: ");
        int a = in.nextInt();
        System.out.print("Input number B: ");
        int b = in.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        if (absA < absB) {
            int temp = absA;
            absA = absB;
            absB = temp;
        }

        System.out.println(gcd(absA, absB));
    }

    public static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
