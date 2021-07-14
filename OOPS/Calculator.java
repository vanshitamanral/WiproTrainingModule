package OOPS;

class Calculatorx{
	int num1, num2;
	static int powerInt(int num1, int num2)
	{
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1, double num2)
	{
		return Math.pow(num1, num2);
	}
}

public class Calculator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculatorx.powerInt(5, 2));
		System.out.println(Calculatorx.powerDouble(5.5, 2.0));
		

	}

}
