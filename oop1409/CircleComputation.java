import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double diameter = 2 * radius;
        System.out.println("The diameter is: " + diameter);

        double area = Math.PI * radius * radius;
        System.out.println("The area is: " + area);

        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: " + circumference);

    }
}
