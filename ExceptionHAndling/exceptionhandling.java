/*Handle exception in number
Problem statement: 
Get the input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output). 
Sample input and output 1: 
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.
*/

package ExceptionHAndling;

import java.util.Scanner;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		try {
			String str=s.next();
			int num=Integer.parseInt(str);
			System.out.println("Square of the value is "+Math.pow(num, 2));
			System.out.println("Work has been done succesfully");
		}catch(NumberFormatException  e)
		{
			System.out.println("Entered input is not a valid format of integer");
		}
		
		

	}

}
