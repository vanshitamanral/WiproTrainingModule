/*
 * Create a class Employee and implement the below method in the class.
Write Junit testcases to test the below given method:

public String findName(ArrayList employees,String name){
  String result="";
  if(employees.contains(name)){
   result="FOUND";
  }else{
   result="NOT FOUND";
  }
  return result;
 }
*/
package Junit;

import java.util.ArrayList;

public class MyUnitEmployee {

	public static String findName(ArrayList<String> employees, String name)
	{
		String result="";
		if(employees.contains(name))
		{
			result="FOUND";
		}else
		{
			result="NOT FOUND";
		}
		return result;
	}

}
