import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inStrText;

        System.out.print("Enter a plaintext string : ");
        inStrText = input.next();
        input.close();
       
        String text = inStrText.toUpperCase();
        System.out.print("The ciphertext string is : ");

        for ( int number = 0; number < text.length(); number++ ) {
            int num1 = 'A';
            int num2 = 'Z';
            int num3 = text.charAt(number);
            System.out.print((char) (num1 + num2 - num3));
        }
    }
}