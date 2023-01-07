import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        while (n>0) {
            int digit = n%10;
            System.out.print(digit + " ");
            n = n/10;
        }
    }
}
