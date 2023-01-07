public class ComputePI {
    public static void main(String[] args) {
        double sum = 0;
        int MAXDENOMINATOR = 1000;

        for (int denominator = 1; denominator <= MAXDENOMINATOR; denominator += 2 ) {
            if (denominator %4 == 1) {
                sum += (double) 1/denominator;
            } else if (denominator %4 == 3) {
                sum -= (double) 1/denominator;
            } else {
                System.out.println("Impossible!");
            }
        }
        
        double result = 4 * sum;

        System.out.println("The result is: " + result);
        System.out.println("The difference is: " + Math.abs(Math.PI - result)); 
    }
}
