package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class junitTestCase {

	@Test
	public void test() {
		assertEquals("Hello World",MyUnit.stringConcat("Hello", " World"));
	}

}
