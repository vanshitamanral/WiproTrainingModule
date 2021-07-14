package String;

import java.util.Scanner;

public class returnString8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String result="";
		String str1=s.next();
		int n=s.nextInt();
		for(int j=0;j<n;j++)
		{
			for(int i=n-1;i<str1.length();i++)
			{
				result+=str1.charAt(i);
			}
		}
		System.out.println(result);
	}

}
