package Array;

public class printsum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		avg=sum/2;
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+avg);
	}

}
