/*
 * Create two threads and assign names ‘Scooby’ and ‘Shaggy’ 
 * to the two threads. 
 * Display both thread names.
 * 
*/
package Threading;

class thread extends Thread
{
	Thread th1;
	public void run()
	{
		System.out.println("Thread name:"+th1.currentThread().getName());
	}
}

public class displayNames  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread d=new thread();
		Thread t1=new Thread(d,"Scooby");
		Thread t2=new Thread(d,"Shaggy");
		t1.start();
		t2.start();
		
		

	}

}
