import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int number = in.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }

        double distribution = Math.round(((count*100)/number)*100) / 100;
        System.out.println(count + " primes found (" + distribution + "%)");
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
