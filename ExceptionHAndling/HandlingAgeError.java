/*Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 
The program must exit gracefully after displaying the error message in case the arguments passed are not proper. (Hint : Create a user defined exception class for handling errors.)
*/

package ExceptionHAndling;
import java.util.Scanner;
class InvalidAgeError extends Exception
{
	public void checkAge(int age) throws InvalidAgeError
	{
		if(age>=18 && age<60)
		{
			System.out.println("Entered age is correct");
		}else
		{
			throw new InvalidAgeError();
		}
	}
}

public class HandlingAgeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		InvalidAgeError e=new InvalidAgeError();
		try
		{
			String name=s.next();
			int age=s.nextInt();
			e.checkAge(age);
		}catch(InvalidAgeError ex)
		{
			System.out.println("The Age is not appropriate");
		}
		

	}

}
