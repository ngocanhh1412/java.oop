import java.util.Scanner;

public class HillPatternB {
  	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int size;
    		System.out.printf("Enter the size: ");
    		size = sc.nextInt();
    
		for(int i = size; i >= 1; --i) {
      			for(int space = 1; space <= size - i; ++space) {
        			System.out.print("  ");
      			}
      			for(int j=i; j <= 2 * i - 1; ++j) {
        			System.out.print("# ");
      			}
      			for(int j = 0; j < i - 1; ++j) {
        			System.out.print("# ");
      			}
      			System.out.println();
    		}
  	}
}