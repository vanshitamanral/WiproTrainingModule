package collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class Employee{
	private int id;
	private String name;
	private String address;
	private Double salary;
	private String email;
	
	Employee(int id, String name, String address, Double salary, String email) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.email=email;
	}	
	
	public int getId() {
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getEmail()
	{
		return email;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public void salary(double salary)
	{
		this.salary=salary;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public String GetEmployeeDetails() {
		return "Employee [EmpId=" + id + ", EmpName=" + name + ", EmpEmail=" + email 
				+", EmpSalary=" + salary + "]";
	}
}
public class EmployeeDB {
	ArrayList<Employee> employeeDb= new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return employeeDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = employeeDb.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : employeeDb) {
			if (e.getId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " + e.getSalary();
			}
		}

		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		EmployeeDB empDb = new EmployeeDB();
		Employee emp1=new Employee(321,"Dora","Park Street",30000.00,"d.ora@gmail.com");
		Employee emp2=new Employee(322,"Nobi","Ontario Street",70000.00,"no.bi@gmail.com");
		Employee emp3=new Employee(323,"sizhuka","Otawwa Street",50000.00,"sizu.21@gmail.com");
		Employee emp4=new Employee(329,"gian","New Way Street",30000.00,"dgi1@gmail.com");
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println("Enter the id you want to del:");
		int i=s.nextInt();
		empDb.deleteEmployee(i);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		System.out.println("Enter the id you want to know the pay:");
		int p=s.nextInt();
		System.out.println(empDb.showPaySlip(p));

	}

}
