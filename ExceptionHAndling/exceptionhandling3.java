/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero. 

 This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .  Use exception handling mechanisms to handle this exception. 

*/

package ExceptionHAndling;

import java.util.Scanner;

public class exceptionhandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		try {
			int size=s.nextInt();
			
			int arr[]=new int[size];
			for(int i=0;i<size;i++)
			{
				String str=s.next();
				arr[i]=Integer.parseInt(str);
			}
			System.out.println("Enter the index you want to print");
			int index=s.nextInt();
			System.out.println("The array element at index "+index+" = "+arr[index]);
			System.out.println("Array element successfully accessed");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}


	}

}
