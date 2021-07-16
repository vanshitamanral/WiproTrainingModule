package Junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class junitTestCaseEmployee {

	ArrayList<String> emp=new ArrayList<>();
	{
		emp.add("Kirti");
		emp.add("Manan");
		emp.add("Pushp");
		emp.add("Shyam");
	}
	@Test
	public void test() {
		System.out.println("Starting testing");
		assertEquals("result","FOUND",MyUnitEmployee.findName(emp, "Shyam"));
	}

}
