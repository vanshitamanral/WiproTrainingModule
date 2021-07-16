/*
 *  Implement the assignment 1 using Hashtable
 *  
*/
package Generics_hashmap_hashset;
import java.util.*;


class CM{
	String CountryName;
	String capital;
	
	Hashtable <String,String> hm= new Hashtable<String,String>();
	public Hashtable <String,String> saveCountryCapital(String cn,String cp)
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
	
	Hashtable <String,String>newhm= new Hashtable<String,String>();
	public Hashtable saveCapitalCountry()
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
public class UsingHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		CM c= new CM();
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
