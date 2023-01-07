import java.util.Scanner;

public class RadixN2Dec {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String str;
		int radix;
		int num;
		System.out.print( "Enter the radix : " );
		radix = sc.nextInt();
		System.out.print( "Enter the string : " );
		str = sc.next();
		if ( radix == 2 ) {
			num = Integer.parseInt(str, 2);
			System.out.print( "The equivalent decimal number " + str + " is : " + num );
		}
		if ( radix == 8 ) {
			num = Integer.parseInt(str, 8);
			System.out.print( "The equivalent decimal number " + str + " is : " + num );
		}
		if ( radix == 10 ) {
			num = Integer.parseInt(str, 10);
			System.out.print( "The equivalent decimal number " + str + " is : " + num );
		}
		if ( radix == 16 ) {
			num = Integer.parseInt(str, 16);
			System.out.print( "The equivalent decimal number " + str + " is : " + num );
		}
	}
}

