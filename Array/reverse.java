package Array;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[][]= new int[2][2];
		for(int r=0;r<2;r++)
		{
			for(int c=0;c<2;c++)
			{
				arr[r][c]=s.nextInt();
			}
		}
		
		for(int r=1;r>=0;r--)
		{
			for(int c=1;c>=0;c--)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		
	}

}
