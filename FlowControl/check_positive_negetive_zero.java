package FlowControl;

import java.util.Scanner;

public class check_positive_negetive_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		if(num>0)
		{
			System.out.print("Positive");
		}else if(num==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.print("Negative");
		}
	}

}
