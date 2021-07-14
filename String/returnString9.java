package String;

import java.util.Scanner;

public class returnString9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str2=s.next();
		String str1=s.next();
		String result="";
		for(int i=0;i<str1.length()-str2.length()+1;i++)
		{
			String tmp=str1.substring(i,i+str2.length());
			if(i>0 && tmp.equals(str2))
			{
				result+=str1.substring(i-1,i);
			}
			if(i<str1.length()-str2.length() && tmp.equals(str2))
			{
				result+=str1.substring(i+str2.length(),i+str2.length()+1);
			}
		}
		System.out.println(result);
	}

}
