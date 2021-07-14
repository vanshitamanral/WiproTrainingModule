package Array;

import java.util.Scanner;

public class highestoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int count=1,maxcount=0,x=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			
			if(count>maxcount)
			{
				maxcount=count;
				x=arr[i];
			}
			count=1;
		}
		System.out.println(x+"->"+maxcount+" times");

	}

}
