import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        while (num > 0) {
            int reverseNum = num % 10;
            System.out.print(reverseNum);
            num = num / 10;
        }
    }
}
