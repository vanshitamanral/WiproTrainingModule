package WrapperClass;

public class digitalnumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=Integer.parseInt(args[0]);
		System.out.println("Binary equivalent: "+Integer.toBinaryString(i));
		System.out.println("Octal equivalent: "+Integer.toOctalString(i));
		System.out.println("Hexadecimal equivalent: "+Integer.toHexString(i));
		

	}

}
