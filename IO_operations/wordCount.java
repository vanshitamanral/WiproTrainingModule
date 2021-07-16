package IO_operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the file name:");
		String filename=s.next();
		File f=new File(filename);
		HashMap<String,Integer> wordfile= new HashMap<>();
		BufferedReader fReader = new BufferedReader(new FileReader("Input.txt"));
		String data;
		while((data=fReader.readLine())!=null)
		{
			data=data.trim();
			String[] res=data.split(" ");
			for(int i=0;i<res.length;i++)
			{
				//System.out.println(res[i]);
				wordfile.put(res[i], wordfile.getOrDefault(res[i],0)+1);
			}
			
		}
		//System.out.println(wordfile);
		fReader.close();
		FileWriter fwrite= new FileWriter(filename);
		for(String str:wordfile.keySet())
		{
			fwrite.write(str+": "+wordfile.get(str)+"\n");
		}
		System.out.println("Data successfully written");
		fwrite.close();

	}

}
