import java.util.Scanner;

public class FibonacciDeQuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fib(x));
    }

    public static int fib(int x) {
        if (x==1) {
            return 1;
        }

        return fib(x-1) + fib(x-2);

    }
}
