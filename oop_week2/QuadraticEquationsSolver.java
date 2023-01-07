import java.util.Scanner;

public class QuadraticEquationsSolver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a: ");
		double a = input.nextDouble();
		System.out.print("Input b: ");
		double b = input.nextDouble();
		System.out.print("Input c: ");
		double c = input.nextDouble();
		input.close();

		double delta = b*b - 4*a*c;
		
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2*a);
			double x2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.println("The roots are " + x1 + " and " + x2);
		} else if (delta == 0) {
			double x = (-b) / (2*a);
			System.out.println("The roots is " + x);
		} else {
			System.out.println("The equation has no real roots. ");
		}
	}
}
			