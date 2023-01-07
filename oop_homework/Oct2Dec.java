import java.util.Scanner;

public class Oct2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Octal string: ");
		int octNum = input.nextInt();

		int numcount = octNum;
		int count = 0;
		while (numcount !=0) {
			numcount /= 10;
			++ count;
		}

		int i;
		int num = octNum; 
		int decNum = 0;
		for (i=(count-1); i>=0; i--) {
			decNum += (int)(num/(Math.pow(10, i))) * Math.pow(8, i);
			num =(int)(num % (Math.pow(10, i)));
		}
	
		System.out.println("The equivalent decimal number " + octNum +" is: " + decNum);
	}
}
	
		