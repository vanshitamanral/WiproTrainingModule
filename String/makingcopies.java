package String;

import java.util.Scanner;

public class makingcopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.next();
		String finalstr="";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<2;j++)
			{
				finalstr+=str.charAt(j);
			}
		}
		System.out.println(finalstr);
		

	}

}
