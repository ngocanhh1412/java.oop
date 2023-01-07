import java.util.Scanner;

public class GCDRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number A: ");
        int a = in.nextInt();
        System.out.print("Input number B: ");
        int b = in.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        System.out.println(gcd(absA, absB));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }
    }

}
