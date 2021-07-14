package Array;

import java.util.Scanner;

//{1,4,34,56,7}
//90
//56

public class findInt {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int arr[]= {1,4,34,56,7};
		int search=s.nextInt();
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(search==arr[i])
			{
				pos=i;
				break;
			}
			else
			{
				pos=-1;
			}
		}
		System.out.println(pos);

	}

}
