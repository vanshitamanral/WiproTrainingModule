package CollectAndGroupCards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GroupCards {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number of Cards:");
		int n=s.nextInt();
		HashMap<Character,ArrayList<Integer>> hm= new HashMap<>();
		ArrayList<Integer> list= new ArrayList<>();
		char symbol;
		int number;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter card" + " " + i);
			symbol=s.next().charAt(0);
			number=s.nextInt();
			if(hm.containsKey(symbol))
			{
				list=hm.get(symbol);
				list.add(number);
			}else
			{
				list=new ArrayList<Integer>();
				list.add(number);
				hm.put(symbol, list);
			}
		}
		
		System.out.println("Distinct Symbols are: ");
		for(char ch:hm.keySet())
		{
			System.out.println(ch+" ");
		}
		System.out.println();
		int count=0,sum=0;
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println("Cards in "+m.getKey()+" Symbol");
			ArrayList<Integer> temp = (ArrayList<Integer>) m.getValue();
			Iterator itr= temp.iterator();
			while(itr.hasNext())
			{
				count++;
				int val = (int) itr.next();
				System.out.print(m.getKey());
				System.out.println(" " + val);
				sum += val;
			}
			System.out.println("Number of cards: "+count);
			System.out.println("Sum of numbers: "+sum);
			sum=0;
			count=0;
		}
		
		
	}

}
