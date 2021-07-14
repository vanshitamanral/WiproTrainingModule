package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
			}
		}
		System.out.print(list);
	}

}
