package collection_list;

import java.util.ArrayList;

class arryList<T> extends ArrayList<T>
{
	public boolean add(T t)
	{
		if (t instanceof Integer || t instanceof Float ||t instanceof Double )
		{
			super.add(t);
			return true;
		}else
			return false;
		
	}
}
public class arrayListonlynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list= new ArrayList<>();
		
		list.add(1);
		list.add(5.60F);
		list.add(2.4567D);
		System.out.println("List:"+list);
		

	}

}
