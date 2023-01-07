package oop1409;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = input.nextInt();
		input.close();

		System.out.println("The number is " + number);
		if (number%2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
		
		System.out.println("BYE");
	}
}