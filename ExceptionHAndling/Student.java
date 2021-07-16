/*A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
registerUser– The parameter are String username,String userCountry and add the following logic,
• if userCountry is not equal to  “India” throw a InvalidCountryException with the message “User Outside India  cannot be registered”
• if userCountry is equal to  “India”,  print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves,
Name Country Expected Output
Mickey US InvalidCountryException should be thrown.
 The message should be “User Outside India  cannot be registered”
Mini India The message should be “User registration done successfully”
Sample Input and Output
*/
package ExceptionHAndling;

import java.util.Scanner;

class InvalidCountryException extends Exception
{
	public InvalidCountryException()
	{
		System.out.println("InvalidCountryException occured");
		System.out.println("User outside India cannot be registered");
	}
}
public class Student {
	String username;
	String country;

	public static void registerUser(String un, String c) throws InvalidCountryException
	{
		if(!c.equalsIgnoreCase("India"))
		{
			throw new InvalidCountryException();
		}else
		{
			System.out.println("User Registeration done sucessfully");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try {
			String name=s.next();
			String country=s.next();
			registerUser(name,country);
		}catch(InvalidCountryException e)
		{
			System.out.println(e);
		}
		
		

	}

}
