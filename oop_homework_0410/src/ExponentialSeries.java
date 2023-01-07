import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        Double x = in.nextDouble();

        if (!(x >= -1 && x <= 1)) {
            System.out.print("Invalid input!");
        }

        System.out.print("Input num terms: ");
        int numTerms = in.nextInt();
        in.close();

        System.out.println(specialSeries(x, numTerms));
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        for (int i = 1; i <= numTerms * 2; i += 2) {
            double base = 1;
            double denominator = 1;
            double numerator = 1;
            for (int j = 1; j <= i; j++) {
                base *= x;
                if (j < i && j % 2 == 0) {
                    denominator *= j;
                } else if (j < i) {
                    numerator *= j;
                }
            }
            sum += (base / i) * (numerator / denominator);
        }
        return sum;
    }
}
