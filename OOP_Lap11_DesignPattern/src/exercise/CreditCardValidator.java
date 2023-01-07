package exercise;

public class CreditCardValidator {
    public static boolean isValid(long number) {
        return (getSize(number) >= 13
                && getSize(number) <= 16)
                && (prefixMatched(number, 4)
                || prefixMatched(number, 5)
                || prefixMatched(number, 37)
                || prefixMatched(number, 6))
                && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    public static boolean isValid(String number) {
        return isValid(Long.parseLong(number));
    }

    private static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    private static int getDigit(int number) {
        if (number < 9) {
            return number;
        }
        return number / 10 + number % 10;
    }


}
