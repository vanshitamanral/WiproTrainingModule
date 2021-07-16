/*
 *  Write a program that will have a Properties class which is capable of 
 *  storing some States of India and their Capital.
 *  Use an Iterator to list all the elements of the Properties.
 *  */

package Generics_hashmap_hashset;

import java.util.HashMap;

public class Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> country=new HashMap<>();
		country.put("Haryana", "Chandigarh");
		country.put("Maharashtra", "Mumbai");
		country.put("Punjab", "Chandigarh");
		country.put("Rajasthan", "Jaipur");
		country.put("Tamil Nadu", "Chennai");
		country.put("WestBengal", "Kolkata");
		for(String i:country.keySet())
		{
			System.out.println(i+":"+country.get(i));
		}

	}

}
