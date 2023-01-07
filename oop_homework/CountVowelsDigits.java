import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inStr;
        int inStrLen;

        int numOfVowels = 0;
        int numOfDigits = 0;

        System.out.print("Enter a String: ");

        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();

        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            if (inStr.charAt(charIdx) >= '0' && inStr.charAt(charIdx) <= '9') {
                numOfDigits +=1;
            }
            if (inStr.charAt(charIdx) == 'a' || inStr.charAt(charIdx) == 'e' || inStr.charAt(charIdx) == 'i' || inStr.charAt(charIdx) == 'o' || inStr.charAt(charIdx) == 'u') {
                numOfVowels +=1;
            }
        }

        double vowelsDistribution = ((double)numOfVowels/inStrLen) *100;
        double digitsDistribution = ((double)numOfDigits/inStrLen) *100;
        

        System.out.printf("Number of vowels: " + numOfVowels + " (" + ( (Math.round(vowelsDistribution*100)) / 100 ) + "%%)");
        System.out.println();
        System.out.printf("Number of digits: " + numOfDigits + " (" + ( (Math.round(digitsDistribution*100)) / 100 ) + "%%)");
    }
}
