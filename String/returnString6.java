package String;

import java.util.Scanner;

public class returnString6 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(i==0 && str.charAt(i)!='*')
			{
				res+=str.charAt(i);
			}
			if(i>0 && str.charAt(i)!='*' && str.charAt(i-1)!='*')
			{
				res+=str.charAt(i);
			}
			if(i>0 && str.charAt(i)=='*'&& str.charAt(i-1)!='*')
			{
				res=res.substring(0,res.length()-1);
			}
		}
		
		System.out.println(res);
	}

}
