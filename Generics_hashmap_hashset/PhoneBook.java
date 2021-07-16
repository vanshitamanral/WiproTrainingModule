/*
 *  Write a program to create a HashMap to store name and phone number 
 * (Telephone book). 
 *  When name is given, we can get back the corresponding phone number.*/
package Generics_hashmap_hashset;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		HashMap<String,String> hm= new HashMap<>();
		hm.put("Mother", "+91-8237482901");
		hm.put("Father", "+91-8321388801");
		hm.put("Sister", "+91-9995532140");
		hm.put("Uncle", "+91-8843215671");
		hm.put("Aunt", "+91-734754980");
		hm.put("Akansha", "+91-829310119");
		hm.put("House-Help", "+91-347892794");
		System.out.println("Enter the name for which you want to know the number:");
		String name=s.next();
		System.out.println(name+":"+hm.get(name));

	}

}
