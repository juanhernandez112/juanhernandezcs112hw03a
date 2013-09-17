//import java.util.Scanner;

public class EmployeeTest

{
	public static void main (String args[])
	{
		// employees examples
		Employee employeeOne = new Employee ( "Juan", "Hernandez", 4000.00);
		Employee employeeTwo = new Employee ( "Pepe", "Gonzalez", 5000.00);
		
		// annual salary
		
		System.out.printf("Employee One: %s %s; Annual Salary: %.2f\n", employeeOne.getFirstName(), employeeOne.getLastName(), 12 * employeeOne.getMonthlySalary());
		System.out.printf("Employee Two: %s %s; Annual Salary: %.2f\n", employeeTwo.getFirstName(), employeeTwo.getLastName(), 12 * employeeTwo.getMonthlySalary());
		
		// annual salary increase
		employeeOne.setMonthlySalary(employeeOne.getMonthlySalary() * 1.10);
		employeeTwo.setMonthlySalary(employeeTwo.getMonthlySalary() * 1.10);
		
		// new annual salary
		System.out.printf("Employee One: %s %s; Annual Salary: %.2f\n:", employeeOne.getFirstName(), employeeOne.getLastName(), 12 * employeeOne.getMonthlySalary());
		System.out.printf("Employee Two: %s %s; Annual Salary: %.2f\n:", employeeTwo.getFirstName(), employeeTwo.getLastName(), 12 * employeeTwo.getMonthlySalary());	
		
		
	}
}
