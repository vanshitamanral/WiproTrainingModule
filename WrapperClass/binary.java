package WrapperClass;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		Integer i=new Integer(n);
		String binaryR=Integer.toBinaryString(i);
		System.out.println(String.format("%08d", Integer.parseInt(binaryR)));

	}

}
