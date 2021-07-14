package FlowControl;

import java.util.Scanner;

public class ConvertUppertoLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String Res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				Res+=(char)(str.charAt(i)+32);
			}else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				Res+=(char)(str.charAt(i)-32);
			}
		}
		System.out.println(Res);

	}

}
