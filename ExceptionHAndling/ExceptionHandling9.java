/*
 * Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
*/
package ExceptionHAndling;

import java.util.Scanner;

public class ExceptionHandling9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		try
		{
			System.out.println("Enter the numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			int q=a/b;
			System.out.println("The quotient of "+a+"/"+b+" = "+q);
		}catch(ArithmeticException e)
		{
			System.out.println("DivideByZeroException caught");
		}finally
		{
			System.out.println("Inside finally block");
		}
	}

}
