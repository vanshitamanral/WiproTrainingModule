package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.next();
		String revString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revString+=str.charAt(i);
		}
		if(revString.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
		

	}

}
