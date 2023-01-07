import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        System.out.print("Key in your guess: ");
        Scanner in = new Scanner(System.in);
        guessNumber(in);
    }

    public static int produceRandomNumber() {
        while (true) {
            int SECRET_NUMBER = (int) (Math.random() * 100);
            if (SECRET_NUMBER < 100) {
                return SECRET_NUMBER;
            }
        }
    }

    public static void guessNumber(Scanner in) {
        int count = 0;
        int SECRET_NUMBER = produceRandomNumber();

        while (true) {
            count++;

            int number = in.nextInt();

            if (number > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else if (number < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else {
                System.out.println("You got it in " + count + " trials!");
                break;
            }
        }
    }

}
