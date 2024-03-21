package ArraysAndCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class LinkedListPractise {
	
	@Test
	public void practiseLL()
	{
		ArrayList ll = new ArrayList();
		
		
		ll.add("AAAA");
		ll.add("BBBB");
		ll.add("CCCC");
		
		LinkedList tem= new LinkedList();
		tem.add("XXXX");
		tem.addAll(ll);
		
		System.out.println(tem);
		ll.add("DDDD");
		Collections.shuffle(ll);
		System.out.println(ll);
		tem.removeAll(ll);
		System.out.println(tem);
	}

}
