/*
 *  Implement the assignment 1 using TreeSet
 *  
*/
package Generics_hashmap_hashset;
import java.util.*;


class cTS{
	
	TreeSet <String> hm= new TreeSet<>();
	public TreeSet <String> saveCountryCapital(String cn)
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
public class countryTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		cTS c= new cTS();
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
