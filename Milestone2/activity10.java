package Milestone2;

import java.util.ArrayList;
import java.util.Scanner;

public class activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length of train1:");
		int length1=s.nextInt();
		System.out.println("Enter the speed of train1:");
		int speed1=s.nextInt();
		System.out.println("Enter the length of train2:");
		int length2=s.nextInt();
		System.out.println("Enter the speed of train2:");
		int speed2=s.nextInt();
		double relativeSpeed=speed1+speed2;
		relativeSpeed=(relativeSpeed*5)/18;
		double time;
		if(speed1>speed2)
		{
			time=length2/relativeSpeed;
		}else
		{
			time=length1/relativeSpeed;
		}
		System.out.println("Time taken by Slower train is ="+time);
		

	}

}
