import java.util.Scanner;

public class PrintDayInWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input day number: ");
		int daynumber = input.nextInt();
		input.close();

	//a
		if (daynumber == 0) {
			System.out.println("SUNDAY");
		} else if (daynumber == 1) {
			System.out.println("MONDAY");
		} else if (daynumber == 2) {
			System.out.println("TUESDAY");
		} else if (daynumber == 3) {
			System.out.println("WEDNESDAY");
		} else if (daynumber == 4) {
			System.out.println("THURSDAY");
		} else if (daynumber == 5) {
			System.out.println("FRIDAY");
		} else if (daynumber == 6) {
			System.out.println("SATURDAY");
		} else {
			System.out.println("Not a valid day");
		}

	//b
		switch(daynumber) {
			case 0:
				System.out.println("SUNDAY");
				break;
			case 1:
				System.out.println("MONDAY");
				break;
			case 2:
				System.out.println("TUESDAY");
				break;
			case 3:
				System.out.println("WEDNESDAY");
				break;
			case 4:
				System.out.println("THURSDAY");
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6:
				System.out.println("SATURDAY");
				break;
			default:
				System.out.println("Not a valid day");
		}
	}
}

