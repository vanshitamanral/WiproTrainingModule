package Threading;

public class priority implements Runnable {
	static Thread Thread1;
	static Thread Thread2;
	static Thread Thread3;
	public static void main(String[] args) {
		priority p= new priority();
		// TODO Auto-generated method stub
		Thread t1= new Thread(p,"Thread1");
		Thread t2= new Thread(p,"Thread2");
		Thread t3= new Thread(p,"Thread3");
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName() + ": " + i);	
		
		
	}

}
