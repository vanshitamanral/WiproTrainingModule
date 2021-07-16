/*Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not 
b) Check if a particular value exists or not 
c) Use Iterator to loop through the map key set
*/
package Generics_hashmap_hashset;

import java.util.HashMap;
import java.util.Scanner;

public class UsingHashmap {
	public static void isKeyPresent(HashMap<String,String> hm,String key)
	{
		if(hm.containsKey(key))
		{
			System.out.println("We got the key");
		}
		else
			System.out.println("We could'nt find the desired key");
	}
	
	public static void isValuePresent(HashMap<String,String> hm,String value)
	{
		if(hm.containsValue(value))
		{
			System.out.println("We got the value");
		}
		else
			System.out.println("We could'nt find the desired value");
	}
	
	public static void displayMap(HashMap<String,String> hm)
	{
		for(String str:hm.keySet())
		{
			System.out.println(str+"           "+hm.get(str));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		HashMap<String,String> hm= new HashMap<>();
		hm.put("North-Indian", "Butter Chicken");
		hm.put("South-India", "idli-Sambar");
		hm.put("Chinese", "Chilly chicken Lollipop");
		hm.put("Japanese", "Sushi");
		hm.put("Korean", "Ramyeon");
		System.out.println("Enter the Key & value you want to find:");
		String key=s.next();
		String value=s.next();
		isKeyPresent(hm,key);
		System.out.println();
		isValuePresent(hm,value);
		System.out.println();
		System.out.println("****Continental food Menu****");
		displayMap(hm);
		
		

	}

}
