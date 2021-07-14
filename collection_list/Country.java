/*Develop a java class with a instance variable CountryMap  HashMap (M1)  
 * add a method saveCountryCapital(String CountryName, String capital) , 
 * the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country                          Value - Capital
India                                                   Delhi
Japan                                                Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the  country passed from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                                           India
Tokyo                                        Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all 
the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
*/
package collection_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class CountryMap{
	String CountryName;
	String capital;
	
	HashMap <String,String> hm= new HashMap<>();
	public HashMap <String,String> saveCountryCapital(String cn,String cp)
	{
		hm.put(cn,cp);
		return hm;
	}
	
	public String getCaptital(String cn)
	{
		return hm.get(cn);
	}
	public String getCountry(String cp)
	{
		String country="";
		for(String i:hm.keySet())
		{
			if(hm.get(i).equalsIgnoreCase(cp))
			{
				country=i;
			}
		}
		return country;
	}
	
	HashMap <String,String> newhm= new HashMap<>();
	public HashMap <String,String> saveCapitalCountry()
	{
		for(String i:hm.keySet())
		{
			newhm.put(hm.get(i), i);
		}
		return newhm;
	}
	
	public ArrayList<String> creatinglist()
	{
		ArrayList<String> al=new ArrayList<>();
		for(String i:hm.keySet())
		{
			al.add(i);
		}
		return al;
	}
}
public class Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		CountryMap c= new CountryMap();
		c.saveCountryCapital("India", "Delhi");
		c.saveCountryCapital("South Korea", "Seoul");
		c.saveCountryCapital("Canada", "Ottawa");
		c.saveCountryCapital("Bangladesh", "Dhaka");
		c.saveCountryCapital("China", "Beijing");
		c.saveCountryCapital("France", "Paris");
		c.saveCountryCapital("Germany", "Berlin");
		c.saveCountryCapital("Italy", "Rome");
		c.saveCountryCapital("Japan", "Tokyo");
		c.saveCountryCapital("Nepal","Kathmandu");
		c.saveCountryCapital("Russia", "Moscow");
		c.saveCountryCapital("UAE", "Abu Dhabi");
		c.saveCountryCapital("UK", "London");
		c.saveCountryCapital("US", "Washington, DC");
		
		System.out.println("Enter the capital to know its country:");
		String capital=s.next();
		System.out.println(c.getCountry(capital));
		System.out.println("Enter the country to know its capital:");
		String country=s.next();
		System.out.println(c.getCaptital(country));

		System.out.println();
		System.out.println("key-> Capital     Value->Country");
		System.out.println(c.saveCapitalCountry());
		
		System.out.println();
		System.out.println("ArrayList with countries from Hashmap:");
		System.out.println(c.creatinglist());
	}

}
