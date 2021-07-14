package String;

import java.util.Scanner;

public class returnString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.next();
		String sep=s.next();
		int count=s.nextInt();
		String result="";
		for(int i=0;i<count;i++)
		{
			if(i<count-1)
			{
				result+=str+sep;
			}else
			{
				result+=str;
			}
			
		}
		System.out.println(result);

	}

}
