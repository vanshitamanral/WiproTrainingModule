/* File Copy
Write a program to copy from one file to another.

Sample Input and Output:
Enter the input file name
Input.txt
Enter the output file name
Output.txt
*/
package IO_operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename = sc.nextLine();
		File file=new File(filename);
		file.createNewFile();
		System.out.println("Enter the file name from which you want to copy");
		String copyFile=sc.next();
		File f=new File(copyFile);
		Scanner fReader= new Scanner(f);
		FileWriter fwrite= new FileWriter(filename);
		while(fReader.hasNext())
		{
			String data=fReader.nextLine();
			fwrite.write(data+"\n");
			
			System.out.println("Data Succesfully written");
		}
		fReader.close();
		fwrite.close();

	}

}
