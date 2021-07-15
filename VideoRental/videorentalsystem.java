package VideoRental;

import java.util.ArrayList;
import java.util.Scanner;

class video{
	String title;
	boolean isChecked=false;
	int rating;
	ArrayList<String> videos= new ArrayList<>();
	ArrayList<Integer> ratings= new ArrayList<>();
	public void addvideo(String title)
	{
		videos.add(title);
		System.out.println("The video has been successfully added to the inventory");
	}
	
	public void checkOut(String title)
	{
		if(videos.contains(title))
		{
			videos.remove(title);
			isChecked=true;
			System.out.println("Video "+title+" has been checked out");
		}else
		{
			System.out.println("Sorry "+ title + "is already rented out");
		}
	}
	
	public void returnVideo(String title)
	{
		videos.add(title);
		System.out.println("Video has been returned, check the inventory for the changes");
	}
	
	public void recieveRating(String title, int rating)
	{
		for(int i=0;i<videos.size();i++)
		{
			if(videos.get(i).equalsIgnoreCase(title))
			{
				ratings.add(i,rating);
			}
		}
	}
	
	public void listInventory()
	{
		int i=0;
		int j=0;
		System.out.println("Title						Ratings");
		while(i<videos.size() && j<videos.size())
		{
			System.out.println(videos.get(i)+"					"+ratings.get(j));
			i++;
			j++;
		}
	}
}

public class videorentalsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		video v= new video();
		int options;
		System.out.println("******The Sister's Inventory******");
		System.out.println("1. Add Video");
		System.out.println("2. Check Out Video");
		System.out.println("3. Return Video");
		System.out.println("4. Recieve Rating");
		System.out.println("5. List Inventory");
		do
		{
			System.out.println("Choose any of the options to continue");
			options=s.nextInt();
			switch(options)
			{
			case 1:
				System.out.println("Enter the title of the video you want to add");
				s.nextLine();
				String title=s.nextLine();
				v.addvideo(title);
				break;
			case 2:
				System.out.println("Enter the video you want to check out");
				s.nextLine();
				String title1=s.nextLine();
				v.checkOut(title1);
				break;
			case 3:
				System.out.println("Enter the video you want to return");
				s.nextLine();
				String title2=s.nextLine();
				v.returnVideo(title2);
				break;
			case 4:
				System.out.println("Enter the video you want to give ratings");
				s.nextLine();
				String title3=s.nextLine();
				System.out.println("Enter the ratings");
				int rating=s.nextInt();
				v.recieveRating(title3, rating);
				break;
			case 5:
				System.out.println("Here is the list of the videos in Inventory");
				v.listInventory();
				break;
			default:
				System.out.println("Invalid option");
				System.out.println("Try again :<");
				break;
				
			}
			
		}while(options<6 && options>=1);
		
	}

}
