package Milestone2;

import java.util.ArrayList;
import java.util.Scanner;

public class activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		ArrayList<Integer> numbers= new ArrayList<>();
		ArrayList<Integer> divisible= new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			numbers.add(s.nextInt());
		}
		for(int i=0;i<10;i++)
		{
			if(numbers.get(i)%2==0)
			{
				divisible.add(numbers.get(i));
			}
		}
		System.out.println(divisible);

	}

}
