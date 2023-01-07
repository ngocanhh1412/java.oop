import java.util.Arrays;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        guessWord(in);
    }

    public static boolean equalArray(String[] array1, String[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!(array1[i].equals(array2[i]))) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void guessWord(Scanner scan) {
        String SECRET_STRING = "testing";
        int count = 0;

        String[] answer = new String[SECRET_STRING.length()];
        boolean[] booleans = new boolean[SECRET_STRING.length()];
        String[] secretChars = new String[SECRET_STRING.length()];

        Arrays.fill(answer, "_");

        for (int i = 0; i < SECRET_STRING.length(); i++) {
            secretChars[i] = Character.toString(SECRET_STRING.charAt(i));
        }

        while (true) {
            count++;
            Arrays.fill(booleans, false);

            String input = scan.next().toLowerCase();

            if (input.length() >= 2 && input.equals(SECRET_STRING)) {
                System.out.println(input);
                System.out.println("You got this in " + count + " times.");
                break;
            } else if (input.length() >= 2 && !(input.equals(SECRET_STRING))) {
                System.out.println("Incorrect!");
            }

            for (int i = 0; i < secretChars.length; i++) {
                if (secretChars[i].equals(input)) {
                    booleans[i] = true;
                }
            }

            for (int i = 0; i < answer.length; i++) {
                if (booleans[i]) {
                    answer[i] = input;
                }
            }

            printArray(answer);

            if (equalArray(answer, secretChars)) {
                printArray(answer);
                System.out.println("You got this in " + count + " times.");
                break;
            }
        }
    }
}
