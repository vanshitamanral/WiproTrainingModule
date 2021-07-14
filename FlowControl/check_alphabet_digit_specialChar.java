package FlowControl;

import java.util.Scanner;

public class check_alphabet_digit_specialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		char ch= s.next().charAt(0);
		if((int)ch>=48 && (int)ch<=57)
		{
			System.out.println("Digit");
		}else if((int)ch>=65 && (int)ch<=90)
		{
			System.out.println("Alphabet");
		}else if((int)ch>=97 && (int)ch<=122)
		{
			System.out.println("Alphabet");
		}else if((int)ch>=33 && (int)ch<=38)
		{
			System.out.println("Special Character");
		}
		

	}

}
