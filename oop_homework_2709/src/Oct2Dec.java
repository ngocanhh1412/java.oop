import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octString = in.next();

        System.out.print(convertOctalToDecimal(octString));
    }

    public static int toDigit(char ch) {
        final String OCTAL_DIGITS = "01234567";
        return OCTAL_DIGITS.indexOf(ch);

        //return Character.digit(ch, radix: 8);
    }

    public static boolean isValidOctalString(String lowerCaseStr) {
        char ch;
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            ch = lowerCaseStr.charAt(i);
            if (!(ch >= '0' && ch <= '7')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidOctalString2(String lowerCaseStr) {
        if ((lowerCaseStr == null) || (lowerCaseStr.length() == 0)) {
            return false;
        }

        final String OCTAL_DIGITS = "01234567";
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            if (OCTAL_DIGITS.indexOf(lowerCaseStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int convertOctalToDecimal(String octString) {
        if (!isValidOctalString(octString)) {
            return -1;
        }

        int decValue = 0;
        for (int i = 0; i< octString.length(); i++) {
            decValue = decValue * 8 + toDigit(octString.charAt(i));
        }

        return decValue;
    }
}