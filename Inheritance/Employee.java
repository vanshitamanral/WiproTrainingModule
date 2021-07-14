package Inheritance;

public class Employee extends Person{
	static String name;
	double annual_salary;
	int year;
	String national_insurance;
	Employee(int y, String nin)
	{
		super(name);
		year=y;
		national_insurance=nin;
	}
	
	double getsalary()
	{
		return annual_salary;
	}
	
	void setSalary(double as)
	{
		this.annual_salary=as;
	}
	
	void setyear(int y)
	{
		this.year=y;
	}
	
	void setinsurance(String nin)
	{
		this.national_insurance=nin;
	}
	
	
}
