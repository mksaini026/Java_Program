package linkedList;

import java.util.List;
import java.util.ArrayList;

public class JavaLinkList 
{
	public static void main(String[] args)
	{
		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(30);
		ll.add(50);
		ll.add(6);
		for(Integer i : ll)
		{
			System.out.println(i);
		}
		ll.set(1, 11);
		for(Integer i : ll)
		{
			System.out.println(i);
		}
		System.out.println();
		ll.remove(new Integer(11));
		
		for(Integer i : ll)
		{
			System.out.println(i);
		}
	}

}
