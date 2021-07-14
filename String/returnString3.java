package String;

import java.util.Scanner;

public class returnString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String result="";
		if(str1.length()<str2.length())
		{
			result=str1+str2+str1;
		}else if(str1.length()>str2.length()) {
			result=str2+str1+str2;
		}
		
		System.out.println(result);
		

	}

}
