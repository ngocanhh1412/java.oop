import java.util.Scanner;

public class HillPatternA {
  	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int size, k = 0;
    		System.out.print("Enter the size: ");
    		size = sc.nextInt();

    		for (int i = 1; i <= size; ++i, k = 0) {
      			for (int space = 1; space <= size - i; ++space) {
        			System.out.print("  ");
      			}
      			while (k != 2 * i - 1) {
        			System.out.print("# ");
       				++k;	
      			}
      			System.out.println();
    		}
	}
}