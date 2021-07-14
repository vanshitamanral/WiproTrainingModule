package FlowControl;

import java.util.Scanner;

public class rateofInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String Gender=s.next();
		int age=s.nextInt();
		if(Gender.equalsIgnoreCase("Male") && age<=60)
		{
			System.out.println("Interest: 9.2%");
			
		}else if(Gender.equalsIgnoreCase("Male") && age>=61 && age<=120)
		{
			System.out.println("Interest: 8.3%");
			
		}else if(Gender.equalsIgnoreCase("Female") && age<=58)
		{
			System.out.println("Interest: 8.2%");
			
		}else if(Gender.equalsIgnoreCase("Female") && age>=59 && age<=120)
		{
			System.out.println("Interest: 7.6%");
			
		}

	}

}
