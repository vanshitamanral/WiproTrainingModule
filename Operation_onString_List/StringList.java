package Operation_onString_List;

import java.util.ArrayList;
import java.util.Scanner;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> list= new ArrayList<>();
		System.out.println("1. Insert");
		System.out.println("2. Search");
		System.out.println("3. Delete");
		System.out.println("4. Remove");
		System.out.println("5. Exit");
		int options;
		
		do {
			System.out.println("Enter your choice");
			options=s.nextInt();
			switch(options)
			{
			case 1:
				System.out.println("Enter the item to insert:");
				String str=s.next();
				list.add(str);
				break;
			case 2:
				System.out.println("Enter the item to search:");
				String str1=s.next();
				if(list.contains(str1))
				{
					System.out.println("Item found in the list");
				}else
				{
					System.out.println("Item not found in the list");
				}
				break;
			case 3:
				System.out.println("Enter the item to delete");
				String string=s.next();
				if(list.contains(string))
				{
					list.remove(string);
					System.out.println("Item removed Successfully ");
				}else
				{
					System.out.println("Item does not exists");
				}
				break;
			case 4:
				System.out.println("Items in the list are:");
				for(String st:list)
				{
					System.out.println(st);
				}
				break;
			case 5:
				System.out.println("Exited successfully");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			
		}while(options<5 && options>=1);

	}

}
