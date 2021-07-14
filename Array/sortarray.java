package Array;

import java.util.Scanner;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
