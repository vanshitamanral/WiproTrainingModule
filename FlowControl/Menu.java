package FlowControl;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		char decision;
		do {
			System.out.println("Enter the first number");
			int a=s.nextInt();
			System.out.println("Enter the second number");
			int b=s.nextInt();
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("Enter your choice:");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Addition->"+(a+b));
					break;
				case 2: 
					System.out.println("Subtraction->"+(a+b));
					break;
			}
			System.out.println("Do you want to continue? (Y/N)");
			decision=s.next().charAt(0);
		}while(decision!='N');
		

	}

}
