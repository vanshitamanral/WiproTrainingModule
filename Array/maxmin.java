package Array;

public class maxmin {

	public static void main(String[] args) {
		int arr[]= {2,4,1,8,5,9,3};
		int min=100000,max=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
	}

}
