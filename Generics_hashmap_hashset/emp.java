package Generics_hashmap_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> employee = new HashSet<>();
		employee.add("Shyam");
		employee.add("Ronit");
		employee.add("vanika");
		employee.add("Rohan");
		employee.add("Raani");
		employee.add("abc");
		employee.add("Chirag");
		employee.add("Bhoomika");
		employee.add("Anmol");
		Iterator<String> itr=employee.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
