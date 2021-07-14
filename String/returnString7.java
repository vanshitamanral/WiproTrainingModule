package String;

import java.util.Scanner;

public class returnString7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String result="";
		int max=Math.max(str1.length(),str2.length());
		for(int i=0;i<max;i++)
		{
			if(i<=str1.length()-1)
			{
				result+=str1.substring(i,i+1);
			}
			if(i<=str2.length()-1)
			{
				result+=str2.substring(i,i+1);
			}
		}
		System.out.println(result);
	}

}
