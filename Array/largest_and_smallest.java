package Array;

import java.util.Arrays;

public class largest_and_smallest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,78,23,45,14,5};
		Arrays.sort(arr);
		int small1=arr[0];
		int small2=arr[1];
		int large1=arr[arr.length-1];
		int large2=arr[arr.length-2];
		System.out.println("Small:"+small1+"  Small:"+small2+"  large:"+large1+"  large:"+large2);

	}

}
