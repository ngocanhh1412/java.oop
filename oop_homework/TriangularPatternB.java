import java.util.Scanner;

public class TriangularPatternB {
  	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("Enter the size: ");
    		int size = sc.nextInt();

    		for (int row = size; row >= 1; --row) {
      			for (int col = 1; col <= row; ++col) {
        			System.out.print("# ");
      			}
      		System.out.println();
    		}
  	}
}