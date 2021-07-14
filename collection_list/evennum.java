package collection_list;

import java.util.ArrayList;
import java.util.Scanner;

class saveEvenNumber{
	public ArrayList<Integer> saveEvenNumbers(int N)
	{
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=2;i<=N;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		return list;
		
	}
	
	public ArrayList<Integer> printEvenNumbers(ArrayList<Integer> list)
	{
		ArrayList<Integer> newlist= new ArrayList<>();
		for(int i:list)
		{
			newlist.add(i*2);
		}
		return newlist;
	}
	
	public int printEvenNumber(int N,ArrayList<Integer> list)
	{
		if(list.contains(N))
		{
			return N;
		}else
			return 0;
	}
}
public class evennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveEvenNumber sen=new saveEvenNumber();
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		System.out.println(sen.saveEvenNumbers(N));
		System.out.println(sen.printEvenNumbers(sen.saveEvenNumbers(N)));
		System.out.println("Enter the no. you want to search");
		int x=s.nextInt();
		System.out.println(sen.printEvenNumber(x, sen.saveEvenNumbers(N)));
		

	}

}
