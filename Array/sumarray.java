package Array;

import java.util.Scanner;

public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int index1=0;
		int index2=0;
		int sum_arr=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==6)
			{
				index1=i;
			}
			if(arr[i]==7)
			{
				index2=i;
			}
			sum_arr+=arr[i];
		}
		
		int sum=0;
		for(int i=index1;i<=index2;i++)
		{
			sum+=arr[i];
		}
		
		int res=sum_arr-sum;
		System.out.println(res);
	}

}
