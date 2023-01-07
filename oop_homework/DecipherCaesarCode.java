import java.util.Scanner;

public class DecipherCaesarCode {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String xau;
		System.out.print( "Enter a ciphertext string : " );
		xau = sc.next();
		xau = xau.toUpperCase();
		System.out.print( "The plaintext string is : " );
		for ( int i = 0; i < xau.length(); i = i + 1 ) {
			if ( xau.charAt(i) == 'A' ) {
				System.out.print( "X" );
			} else {
				if ( xau.charAt(i) == 'B' ) {
					System.out.print( "Y" );
				} else {
					if ( xau.charAt(i) == 'C' ) {
						System.out.print( "Z" );
					} else
						System.out.print( (char) (xau.charAt(i) - 3) );
				}
			}
		}
	}
}