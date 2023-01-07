import java.util.Scanner;

public class CaesarCode {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String inStr;
		System.out.print( "Enter a plaintext string : " );
		inStr = sc.next();
		inStr = inStr.toUpperCase();
		System.out.print("The ciphertext string is : ");
		for ( int i = 0; i < inStr.length(); i = i + 1 ) {
			if ( inStr.charAt(i) == 'X' ) {
				System.out.print( "A" );
			} else {
				if ( inStr.charAt(i) == 'Y' ) {
					System.out.print( "B" );
				} else {
					if ( inStr.charAt(i) == 'Z' ) {
						System.out.print( "C" );
					} else
						System.out.print( (char) (inStr.charAt(i) + 3) );
				}
			}
		}
	}
}