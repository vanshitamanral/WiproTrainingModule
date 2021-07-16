package Junit;

public class palindromeString {

	public static boolean checkIsPalindrome(String str)
	{
		boolean ispalin=false;
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			result+=str.charAt(i);
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==result.charAt(i))
			{
				ispalin=true;
			}else
				ispalin=false;
		}
		return ispalin;
	}
}
