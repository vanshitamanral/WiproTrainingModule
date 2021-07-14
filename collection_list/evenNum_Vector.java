package collection_list;


import java.util.Scanner;
import java.util.Vector;

class ENum{
	public Vector<Integer> saveEvenNumbers(int N)
	{
		Vector<Integer> list= new Vector<>();
		for(int i=2;i<=N;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		return list;
		
	}
	
	public Vector<Integer> printEvenNumbers(Vector<Integer> list)
	{
		Vector<Integer> newlist= new Vector<>();
		for(int i:list)
		{
			newlist.add(i*2);
		}
		return newlist;
	}
	
	public int printEvenNumber(int N,Vector<Integer> list)
	{
		if(list.contains(N))
		{
			return N;
		}else
			return 0;
	}
}
public class evenNum_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ENum E=new ENum();
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		System.out.println(E.saveEvenNumbers(N));
		System.out.println(E.printEvenNumbers(E.saveEvenNumbers(N)));
		System.out.println("Enter the no. you want to search");
		int x=s.nextInt();
		System.out.println(E.printEvenNumber(x, E.saveEvenNumbers(N)));
		

	}

}
