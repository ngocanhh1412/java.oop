import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberIn;
        int sum=0; 
        double average;
        final int NUMSTUDENTS = 3;
        boolean isValid;

        for (int studentNo = 1; studentNo <= NUMSTUDENTS; ++studentNo) {
            System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");

            isValid = false;
            do {
                numberIn = sc.nextInt();

                if (numberIn >= 0 && numberIn <=100) {
                    isValid = true;
                } else {
                    System.out.print("Invalid input, try again... ");
                }
            } while (!isValid);
            sum += numberIn;
        }

        average = (double) sum/NUMSTUDENTS;
        System.out.println("The average is: " + average);
    }
}
