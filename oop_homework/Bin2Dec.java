import java.util.Scanner;

public class Bin2Dec {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print( "Enter a Binary string: " );
		str = sc.next();
		int dem = 0;
		int tong = 0;
		for ( int i = 0; i < str.length(); i = i + 1 ) {
			if ( str.charAt(i) != '0' && str.charAt(i) != '1' ) {
				dem = dem + 1;
			} else {
				if ( str.charAt(i) == '1' ) {
					tong = tong + (int) Math.pow( 2, (str.length() - 1 - i) );
				}
			}
		}
		if ( dem != 0 ) {
			System.out.print( "error: invalid binary string " + str );
		} else
			System.out.print( "The equivalent decimal number for binary " + str + " is : " + tong );
	}
}