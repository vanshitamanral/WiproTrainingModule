package collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

	public void printAll(ArrayList<String> list)
	{
		Iterator <String> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next()+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylist al=new arraylist();
		Scanner s= new Scanner(System.in);
		ArrayList<String> list= new ArrayList<>();

		list.add("Apple");
		list.add("Mango");
		list.add("grapes");
		list.add("Plum");
		list.add("Pineapple");
		al.printAll(list);
		
		
	}

}
