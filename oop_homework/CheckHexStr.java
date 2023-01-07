import java.util.Scanner;

public class CheckHexStr {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String hex;
		System.out.print( "Enter a hex string: " );
		hex = sc.next();
		int dem = 0;
		for ( int i = 0; i < hex.length(); i = i + 1 ) {
			if ( (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')
					|| (hex.charAt(i) >= 'a' && hex.charAt(i) <= 'f') ) {
				dem = dem + 1;
			}
		}
		if ( dem == hex.length() ) {
			System.out.print( hex + " is a hex string" );
		} else {
			System.out.print( hex + " is a NOT hex string" );
		}
	}
}