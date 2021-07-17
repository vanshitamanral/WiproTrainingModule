/*store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface
*/
package Threading;

import java.util.Random;

public class colors implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colors c= new colors();
		
		Thread t1=new Thread(c);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		String colors[]= {"white","blue","black","green","red","yellow"};
		int randomIndex=0;
		while(!colors[randomIndex].equalsIgnoreCase("Red"))
		{
			randomIndex=rand.nextInt(colors.length-1);
			System.out.println(colors[randomIndex]);
		}
		System.out.println("Stopped");
		
	}

}
