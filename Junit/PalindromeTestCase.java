package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTestCase {

	@Test
	public void test() {
		System.out.println("Starts testing");
		assertEquals("isplain",true,palindromeString.checkIsPalindrome("madam"));
		assertEquals("isplain",true,palindromeString.checkIsPalindrome("malayalam"));
		assertEquals("isplain",true,palindromeString.checkIsPalindrome("mom"));
		assertEquals("isplain",false,palindromeString.checkIsPalindrome("kerela"));
		assertEquals("isplain",false,palindromeString.checkIsPalindrome("punjabi"));
		System.out.println("Testing finished");
	}

}
