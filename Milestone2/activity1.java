package Milestone2;

import java.util.Scanner;

public class activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		boolean isPalindrome=true;
		String palindromeString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			palindromeString+=str.charAt(i);
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=palindromeString.charAt(i))
			{
				isPalindrome=false;
				break;
			}
		}
		System.out.println(isPalindrome);
	}

}
