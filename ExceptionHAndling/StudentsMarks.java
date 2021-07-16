package ExceptionHAndling;

import java.util.Scanner;

class InvalidEntryFormat extends Exception{
	public void Avgmarks(int sub1, int sub2, int sub3) throws InvalidEntryFormat
	{
		int sum=0;
		double avg=0.0;
		if((sub1<=100 && sub1>=0) && (sub2<=100 && sub2>=0) && (sub3<=100 && sub3>=0))
		{
			sum=sub1+sub2+sub3;
			avg=sum/3;
			System.out.println("Sum is "+ sum);
			System.out.println("Average is "+avg);
		}else
		{
			throw new InvalidEntryFormat();
			
		}
	}
}

public class StudentsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvalidEntryFormat ex=new InvalidEntryFormat();
		Scanner s= new Scanner(System.in);
		int students[]=new int[2];
		try {
			String name;
			int sub1;
			int sub2, sub3;
			for(int i=0;i<2;i++)
			{
				name=s.next();
				sub1=s.nextInt();
				sub2=s.nextInt();
				sub3=s.nextInt();
				ex.Avgmarks(sub1,sub2,sub3);
			}
		}catch(InvalidEntryFormat e)
		{
			System.out.println("Invalid format or value is out of range");
		}
		
		
	}

}
