package FlowControl;

import java.util.List;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isPrime=1;
		for (int i=2; i<=100; i++) 
		{
            isPrime=0;
            for (int j=2; j<=i/2; j++) 
            {
                if (i%j==0) 
                {
                    isPrime=1;
                    break;
                }
            }
            if (isPrime==0)
                System.out.print(i + " ");
        }
	}
}
