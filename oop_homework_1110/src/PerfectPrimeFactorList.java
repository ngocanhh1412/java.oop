import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int number = in.nextInt();

        int count = 0;

        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 1; i <= number; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();

        double distribution = Math.round(((count*100)/number)*100) / 100;
        System.out.println(count + " numbers found (" + distribution + "%)");
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;

        for (int i = 1; i < aPosInt; i++) {
            if ((aPosInt % i == 0) && (isPrime(i))) {
                product *= i;
            }
        }

        if (product != aPosInt) {
            return false;
        }
        return true;
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
