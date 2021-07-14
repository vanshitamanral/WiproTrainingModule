package collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Eeemp{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	Eeemp(int id, String name, String address, Double salary) {
		
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
public class Employee_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Vector<Eeemp> emp=new Vector<>();
		emp.add(new Eeemp(2134,"Ammy","H.no-5678, park street",7894.34));
		emp.add(new Eeemp(2135,"neny","H.no-890, odayo",8793.45));
		emp.add(new Eeemp(2136,"shinchan","H.no-112, ottawa",10890.76));
		emp.add(new Eeemp(2137,"masao","H.no-907, Ontario,sorlake",567.302));
		
		Iterator<Eeemp> it = emp.iterator();
		System.out.println("Enter the id you want to search for:");
		int x=s.nextInt();
		while (it.hasNext()) {
			Eeemp em = it.next();
			if (em.getId() == x)
				System.out.println(em);
		}

	}

}
