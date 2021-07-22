package EmployeeManagmentSystem;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class emp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("1. Add an Employee");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		File f= new File("EmployeeDetails.txt");
		int choice=0;
		do
		{
			System.out.println("Enter your choice: ");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter Employee ID: ");
				int emp_id=s.nextInt();
				System.out.println("Enter Employee Name: ");
				String emp_name=s.next();
				System.out.println("Enter Employee age: ");
				int emp_age=s.nextInt();
				System.out.println("Enter Employee Salary:");
				double emp_salary=s.nextDouble();
				String str=emp_id+" "+emp_name+" "+emp_age+" "+emp_salary;
				FileWriter fwrite=new FileWriter(f.getAbsoluteFile(),true);
				for(int i=0;i<str.length();i++)
				{
					fwrite.write(str.charAt(i));
				}
				fwrite.close();
				
				break;
			case 2:
				Scanner fread= new Scanner(f);
				System.out.println("-----Report-----");
				while(fread.hasNext())
				{
					System.out.println(fread.nextLine());
					System.out.println();
				}
				System.out.println("-----End of Report-----");
				break;
			case 3:
				System.out.println("Exiting the system");
				break;
			default:
				System.out.println("Invalid input");
				break;
				
			}
		}while(choice<=3);
		

	}

}
