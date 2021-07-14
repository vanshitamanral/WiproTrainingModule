package collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Emp{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	Emp(int id, String name, String address, Double salary) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		ArrayList<Emp> emp=new ArrayList<>();
		emp.add(new Emp(2134,"Ammy","H.no-5678, park street",7894.34));
		emp.add(new Emp(2135,"neny","H.no-890, odayo",8793.45));
		emp.add(new Emp(2136,"shinchan","H.no-112, ottawa",10890.76));
		emp.add(new Emp(2137,"masao","H.no-907, Ontario,sorlake",567.302));
		
		Iterator<Emp> it = emp.iterator();
		int searchId = 2135;
		while (it.hasNext()) {
			Emp em = it.next();
			if (em.getId() == searchId)
				System.out.println(em);
		}

	}

}
