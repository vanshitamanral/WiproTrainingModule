package collection_list;


import java.util.LinkedList;
import java.util.Scanner;

class even
{
	public LinkedList<Integer> saveEvenNumbers(int N)
	{
		LinkedList<Integer> list= new LinkedList<>();
		for(int i=2;i<=N;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		return list;
		
	}
	
	public LinkedList<Integer> printEvenNumbers(LinkedList<Integer> list)
	{
		LinkedList<Integer> newlist= new LinkedList<>();
		for(int i:list)
		{
			newlist.add(i*2);
		}
		return newlist;
	}
	
	public int printEvenNumber(int N,LinkedList<Integer> list)
	{
		if(list.contains(N))
		{
			return N;
		}else
			return 0;
	}
}
public class Evenumber_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even en=new even();
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		System.out.println(en.saveEvenNumbers(N));
		System.out.println(en.printEvenNumbers(en.saveEvenNumbers(N)));
		System.out.println("Enter the no. you want to search");
		int x=s.nextInt();
		System.out.println(en.printEvenNumber(x, en.saveEvenNumbers(N)));

	}

}
