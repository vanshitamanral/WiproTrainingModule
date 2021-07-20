package Hare_TortiseRace;

class Hare extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hare is running---------"+i);
			if(i==60)
			{
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("Hare completes the race");
	}
}

class Tortise extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Tortise is running------"+i);
		}
		System.out.println("Tortise Finishes the race");
	}
}
public class Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hare h= new Hare();
		Thread t1= new Thread(h);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		Tortise t= new Tortise();
		Thread t2= new Thread(t);
		t2.start();
		}

}
