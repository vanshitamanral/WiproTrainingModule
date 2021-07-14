package String;

import java.util.Scanner;

public class returnString4 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x')
		{
			System.out.println(str.substring(1, str.length()-1));
		}else if(str.charAt(0)=='x')
		{
			System.out.println(str.substring(1,str.length()));
		}else if(str.charAt(str.length()-1)=='x')
		{
			System.out.println(str.substring(0,str.length()-1));
		}else
		{
			System.out.println(str);
		}
	}

}
