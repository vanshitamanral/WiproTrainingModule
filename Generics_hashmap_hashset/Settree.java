/* Create Collection called TreeSet which is capable of storing String objects. The Collection should have the following capabilities
a)Reverse the elements of the Collection 
b)Iterate the elements of the TreeSet 
c) Checked if a particular element exists or not
*/
package Generics_hashmap_hashset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Settree {

	static void reverse(TreeSet<String> ts)
	{
		NavigableSet<String> reverseSet = ts.descendingSet();
        
        //get an iterator
        Iterator<String> itr = reverseSet.iterator();
        
        System.out.println("Reverse set: ");
        while(itr.hasNext()){
            System.out.print( itr.next() +" ");
        }
	}
	
	static void iterate(TreeSet<String> ts)
	{
		System.out.println();
		System.out.println("The set contains:");
		Iterator itr= ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}
	
	static void checkElement(TreeSet<String> ts, String ele)
	{
		if(ts.contains(ele))
		{
			System.out.println();
			System.out.println("Element is present");
		}else
		{
			System.out.println("Sorry we couldn't find the specified element");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts= new TreeSet<>();
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Kiwi");
		ts.add("Mango");
		ts.add("Plum");
		ts.add("Pineapple");
		ts.add("Watermelon");
		
		reverse(ts);
		iterate(ts);
		checkElement(ts,"Plum");
		checkElement(ts,"Ice Apple");
		
		

	}

}
