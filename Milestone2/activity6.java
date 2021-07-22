package Milestone2;

import java.util.Scanner;

public class activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		int res=(n*(n+1)*(2*n+1))/6;
		System.out.println("The total number of all possible squares in a square matrix is = "+res);

	}

}
