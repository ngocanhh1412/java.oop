import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int number = in.nextInt();

        int countPerfectNumbers = 0;
        int count = 0;

        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= number; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfectNumbers++;
            }
        }
        System.out.println();
        double perfectNumberDistribution = Math.round(((countPerfectNumbers*100)/number)*100) / 100;
        System.out.println(countPerfectNumbers + " perfect numbers found (" + perfectNumberDistribution + "%)");

        System.out.println();

        System.out.println("These numbers are neither deficient nor perfect: ");
        for (int j = 1; j <= number; j++) {
            if ((isDeficient(j) == false) && (isPerfect(j) == false)) {
                System.out.print(j + " ");
                count++;
            }
        }
        System.out.println();
        double distribution = Math.round(((count*100)/number)*100) / 100;
        System.out.println(countPerfectNumbers + " perfect numbers found (" + distribution + "%)");



    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }

        if (sum != aPosInt) {
            return false;
        }
        return true;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }

        if (sum >= aPosInt) {
            return false;
        }
        return true;
    }
}
