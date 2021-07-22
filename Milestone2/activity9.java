package Milestone2;

import java.util.ArrayList;
import java.util.Scanner;

public class activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		ArrayList<Integer> divisible= new ArrayList<>();
		for(int i=100;i<=999;i++)
		{
			if(i%6==0)
			{
				divisible.add(i);
			}
		}
		System.out.println(divisible);
	}

}
