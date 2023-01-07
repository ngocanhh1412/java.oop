import java.util.Scanner;

public class CheckPassFail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your mark: ");
		int mark = input.nextInt();
		input.close();

		System.out.println("The mark is " + mark);

		if (mark >= 50) {
			System.out.println("PASS");
		} else { 
			System.out.println("FAIL");
		}

		System.out.println("DONE");
	}
}