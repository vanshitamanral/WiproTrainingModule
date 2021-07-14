package FlowControl;

import java.util.Scanner;

public class addValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int rem=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum+=rem;
		}
		System.out.println(sum);

	}

}
