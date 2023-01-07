import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0-10 or 90-100: ");
        int numberIn;

        boolean isValid;

        isValid = false;
        do {
            numberIn = sc.nextInt();

            if ((numberIn >= 0 && numberIn <=10) || (numberIn >= 90 && numberIn <=100)) {
                isValid = true;
            } else {
                System.out.print("Invalid input, try again... ");
            }

        } while (!isValid);
        System.out.println("You have entered: " + numberIn);
    }
}
