package Threading;

public class printing_Numbers extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
			{
				try {
					System.out.println("Sleeping");
					sleep(5000);
					System.out.println("Back to running");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printing_Numbers p= new printing_Numbers();
		Thread t=new Thread(p);
		t.start();

	}

}
