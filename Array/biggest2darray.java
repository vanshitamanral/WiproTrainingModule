package Array;

import java.util.Scanner;

public class biggest2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[][]= new int[3][3];
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				arr[r][c]=s.nextInt();
			}
		}
		
		//searching largest
		int large=0,largest=0;
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<2;c++)
			{
				if(arr[r][c]>arr[r][c+1])
				{
					large=arr[r][c];
				}else if(arr[r][c]<arr[r][c+1])
				{
					large=arr[r][c+1];
				}
				
			}
			if(large>largest)
			{
				largest=large;
			}
		}
		
		System.out.println(largest);
		
		
		

	}

}
