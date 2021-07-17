/*1. Create class of SalesPersons as a thread that will display    fives sales persons name.
2. Create a class as Days as other Thread that has array of seven days.
3. Call the instance of SalesPersons in Days and start both the 
  threads
4. suspend SalesPersons on Sunday and resume on wednesday 
Note: use suspend, resume methods from thread
*/
package Threading;
class SalesPersons extends Thread
{
	public void run()
	{
		String salesman[]= {"Mimy","Paxton","Ben","Fabiola","Yoshida"};
		for(String s:salesman)
		{
			System.out.println("Name: "+s);
			try {
				sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}

class Days extends Thread
{
	public void run()
	{
		SalesPersons sp=new SalesPersons();
		sp.start();
		String days[]= {
				"Sunday",
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday"
		};
		for(String i:days)
		{
			System.out.println(i);
			try {
				sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			if(i.equals("Sunday"))
			{
				System.out.println("Suspending");
				sp.suspend();
				try {
					sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}else if(i.equals("Wednesday"))
			{
				System.out.println("Resuming");
				sp.resume();
				
			}
		}
		
	}
}
public class sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Days d= new Days();
		Thread t2=new Thread(d);
		t2.start();
		

	}

}
