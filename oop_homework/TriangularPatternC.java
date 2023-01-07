import java.util.Scanner;

public class TriangularPatternC {
  	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int k = 0;

        for(int i = size; i >= 1; --i) {
            for(int space = 1; space <= size - i; ++space) {
              System.out.print("  ");
            }
            for(int j=i; j <= i; ++j) {
              System.out.print("# ");
            }
            for(int j = 0; j < i-1; ++j) {
              System.out.print("# ");
            }
            System.out.println();
      }
	}
}