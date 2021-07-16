/*
 *  Implement the assignment 1 using Hashtable
 *  
*/
package Generics_hashmap_hashset;
import java.util.*;


class countryHs{
	
	HashSet <String> hm= new HashSet<>();
	public HashSet <String> saveCountryCapital(String cn)
	{
		hm.add(cn);
		return hm;
	}
	
	
	public String getCountry(String cp)
	{
		String country="null";
		for(String i:hm)
		{
			if(i.equalsIgnoreCase(cp))
				country=cp;
		}
		return country;
	}
	
	
}
public class UsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		countryHs c= new countryHs();
		c.saveCountryCapital("India");
		c.saveCountryCapital("South Korea");
		c.saveCountryCapital("Canada");
		c.saveCountryCapital("Bangladesh");
		c.saveCountryCapital("China");
		c.saveCountryCapital("France");
		c.saveCountryCapital("Germany");
		c.saveCountryCapital("Italy");
		c.saveCountryCapital("Japan");
		c.saveCountryCapital("UAE");
		c.saveCountryCapital("UK");
		c.saveCountryCapital("US");
		
		System.out.println("Enter the country");
		String country=s.next();
		System.out.println(c.getCountry(country));
		

	}

}
