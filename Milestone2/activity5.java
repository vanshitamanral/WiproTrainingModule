package Milestone2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> students= new ArrayList<>();
		HashMap<Integer,Integer> age=new HashMap<>();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Ages of students");
		for(int i=0;i<20;i++)
		{
			students.add(s.nextInt());
		}
		Collections.sort(students);
		System.out.println("Youngest student has age = "+students.get(0));
		System.out.println("Eldest student has age = "+students.get(students.size()-1));
		
		System.out.println();
		int count=0;
		for(int i=0;i<20;i++)
		{
			age.put(students.get(i), age.getOrDefault(students.get(i), 0)+1);
		}
		
		for(Integer i:age.keySet())
		{
			System.out.println("The students with age "+i +" is= "+age.get(i) );
		}

	}

}
