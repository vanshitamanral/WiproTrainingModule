package FlowControl;

public class divisibleby235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int count=0;
		while(count!=5)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				count++;
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
