package Milestone2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the strings A and B");
		String A=s.next();
		String B=s.next();
		List<Character> list= new ArrayList<>();
		int j=0,i=0;
		while(j!=B.length())
		{
			if(A.charAt(i)!=B.charAt(j))
			{
				j++;
			}else
			{
				list.add(A.charAt(i));
				i++;
			}
		}
		
		if(list.size()>=2)
		{
			System.out.println(list);
			System.out.println("True");
		}else
		{
			System.out.println("No substrings present");
		}
		
		

	}

}
