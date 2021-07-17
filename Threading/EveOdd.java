/* Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join
*/
package Threading;

class even extends Thread
{
	public void run()
	{
		System.out.println("Printing Even number");
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("*********************");
	}
}
class odd extends Thread
{
	public void run()
	{
		System.out.println("Printing Odd number");
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		System.out.println("*********************");
	}
}
public class EveOdd extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		odd o= new odd();
		even e= new even();
		Thread t1= new Thread(o);
		Thread t2= new Thread(e);
		t2.start();
		t1.start();
		if(Thread.currentThread().getName().equals("odd"))
		{
			t1.join();
		}

	}

}
