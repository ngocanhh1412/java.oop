import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inStr;
        int inStrLen;

        System.out.print("Enter a String: ");

        inStr = in.next();
        inStrLen = inStr.length();

        System.out.print("The reverse of the String is: ");
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
