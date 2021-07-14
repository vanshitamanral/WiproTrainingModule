package FlowControl;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int rem=0;
		String str="";
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			str+=Integer.valueOf(rem);
		}
		System.out.println(str);
	}

}
