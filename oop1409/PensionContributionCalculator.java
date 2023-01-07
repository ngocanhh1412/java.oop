import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2 ;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17 ;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13 ;
        final double EMPLOYER_RATE_55_TO_60 = 0.13 ;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075 ;
        final double EMPLOYER_RATE_60_TO_65 = 0.09 ;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05 ;
        final double EMPLOYER_RATE_65_ABOVE = 0.075 ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        int contributableSalary;
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        if (salary > SALARY_CEILING) {
            salary = SALARY_CEILING;
        }

        if (age <= 55) {
            employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
            System.out.println("The employee's contribution is: " + employeeContribution);

            employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
            System.out.println("The employer's contribution is: " + employerContribution);

            totalContribution = employeeContribution + employerContribution;
            System.out.println("The total contribution is: " + totalContribution);
        } else if (age > 55 && age <= 60) {
            employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
            System.out.println("The employee's contribution is: " + employeeContribution);

            employerContribution = salary * EMPLOYER_RATE_55_TO_60;
            System.out.println("The employer's contribution is: " + employerContribution);

            totalContribution = employeeContribution + employerContribution;
            System.out.println("The total contribution is: " + totalContribution);
        } else if (age > 60 && age <= 65) {
            employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
            System.out.println("The employee's contribution is: " + employeeContribution);

            employerContribution = salary * EMPLOYER_RATE_60_TO_65;
            System.out.println("The employer's contribution is: " + employerContribution);

            totalContribution = employeeContribution + employerContribution;
            System.out.println("The total contribution is: " + totalContribution);
        } else if (age > 65) {
            employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
            System.out.println("The employee's contribution is: " + employeeContribution);

            employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
            System.out.println("The employer's contribution is: " + employerContribution);

            totalContribution = employeeContribution + employerContribution;
            System.out.println("The total contribution is: " + totalContribution);
        }

        
    }
}
