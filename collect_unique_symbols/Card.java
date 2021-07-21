package collect_unique_symbols;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Card {
	char symbol;
	int number;
	void setSymbol(char s)
	{
		symbol=s;
	}
	void setnumber(int n)
	{
		number=n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		HashMap<Character,Integer> tm= new HashMap<>();
		
		do {
			Card c= new Card();
			System.out.println("Enter a Card: ");
			c.setSymbol(s.next().charAt(0));
			c.setnumber(s.nextInt());
			if(!tm.containsKey(c.symbol))
			{
				tm.put(c.symbol,c.number);
			}
			
		}while(tm.size()!=4);
		
		System.out.println(tm);
		
	}

}
