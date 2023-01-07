import java.util.Scanner;

public class DayInMonthFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a month number: ");
		int month = input.nextInt();
		System.out.print("Input a year: ");
		int year = input.nextInt();
		input.close();

		int numberOfDayInMonth = 0;
		String NameOfMonth = "Unknown";

		switch (month) {
			case 1:
				NameOfMonth = "January";
				numberOfDayInMonth = 31;
				break;
			case 2:
				NameOfMonth = "February";
				if (isLeapYear(year)) {
					numberOfDayInMonth = 29;
				} else {
					numberOfDayInMonth = 28;
				}
				break;
			case 3:
				NameOfMonth = "March";
				numberOfDayInMonth = 31;
				break;
			case 4:
				NameOfMonth = "April";
				numberOfDayInMonth = 30;
				break;
			case 5:
				NameOfMonth = "May";
				numberOfDayInMonth = 31;
				break;
			case 6:
				NameOfMonth = "June";
				numberOfDayInMonth = 30;
				break;
			case 7:
				NameOfMonth = "July";
				numberOfDayInMonth = 31;
				break;
			case 8:
				NameOfMonth = "August";
				numberOfDayInMonth = 31;
				break;
			case 9:
				NameOfMonth = "September";
				numberOfDayInMonth = 30;
				break;
			case 10:
				NameOfMonth = "October";
				numberOfDayInMonth = 31;
				break;
			case 11:
				NameOfMonth = "November";
				numberOfDayInMonth = 30;
				break;
			case 12:
				NameOfMonth = "December";
				numberOfDayInMonth = 31;
				break;
		}

		System.out.println(NameOfMonth + " " + year + " has " + numberOfDayInMonth + " days\n");
	}

	public static boolean isLeapYear(int year) {
		boolean result = ((year % 400) == 0) || (((year % 4) == 0) && ((year  % 100) !=0));
		return result;
	}
}