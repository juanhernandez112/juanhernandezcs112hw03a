
public class Employee {
	//Variables
	private String firstName, lastName;
	private double monthlySalary;
	
	public Employee (String first, String last, double salary)
	{
		firstName = first;
		lastName = last;
		if(salary < 0)
		{monthlySalary = 0;
		}
		else monthlySalary = salary;
	
	}
	
	public String getfirstName(){
	return firstName;
	}
	
	public void setFirstName (String first)
	{
		firstName = first;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName (String last)
	{
		lastName = last;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setMonthlySalary(double salary)
	{
		if (salary >= 0.0 )
			monthlySalary = salary;
		}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
}

