package Milestone2;

import java.util.Scanner;

public class activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("This is a calculator");
		System.out.println("+ - x /");
		String ans="";
		char ch;
		do
		{
			System.out.println("Enter the first number:");
			int a=s.nextInt();
			System.out.println("Enter the second number:");
			int b=s.nextInt();
			int result=0;
			System.out.println("Enter the Operator:");
			ch=s.next().charAt(0);
			switch(ch)
			{
			case '+':
				result=a+b;
				System.out.println(result);
				break;
			case '-':
				result=a-b;
				System.out.println(result);
				break;
			case '*':
				result=a*b;
				System.out.println(result);
				break;
			case '/':
				result=a/b;
				System.out.println(result);
				break;
			default:
				System.out.println("Please enter a valid operator");
				break;
			}
			System.out.println("Do you want to continue? Y/N");
			ans=s.next();
		}while(ans.equalsIgnoreCase("Y"));

	}

}
