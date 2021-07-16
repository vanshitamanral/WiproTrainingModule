package IO_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable
{
	String name;
	String dob;
	String Dept;
	String Designation;
	double salary;
	
	public String getname() {
		return name;
	}
	public void setname(String n)
	{
		this.name=n;
	}
	public String getdob() {
		return dob;
	}
	public void setdob(String d)
	{
		this.dob=d;
	}
	public String getdept() {
		return Dept;
	}
	public void setdept(String dpt)
	{
		this.Dept=dpt;
	}
	public String getdesig() {
		return Designation;
	}
	public void setdesig(String desi)
	{
		this.Designation=desi;
	}
	public double getsalary()
	{
		return salary;
	}
	public void setsalary(double s)
	{
		this.salary=s;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", department=" + Dept + ", designation=" + Designation
				+ ", salary=" + salary + "]";
	}
}
public class serializationandDeserialization {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setname(sc.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp.setdob(sc.nextLine());
		System.out.print("Enter department: ");
		emp.setdept(sc.nextLine());
		System.out.print("Enter designation: ");
		emp.setdesig(sc.nextLine());
		System.out.print("Enter salary: ");
		emp.setsalary(sc.nextDouble());
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("OutObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getname());
		System.out.println("D.O.B.: " + emp2.getdob());
		System.out.println("Department: " + emp2.getdept());
		System.out.println("Designation: " + emp2.getdesig());
		System.out.println("Salary: " + emp2.getsalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		sc.close();
		

	}

}
