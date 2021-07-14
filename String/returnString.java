package String;

import java.util.Scanner;

public class returnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		String str=s.next();
		int length=str.length();
		if(length%2==0)
		{
			System.out.println(str.substring(0,length/2));
		}else
		{
			System.out.println("null");
		}
	}

}
