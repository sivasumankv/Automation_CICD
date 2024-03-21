package ArraysAndCollections;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class SetPractise {

	@Test
	public void SetTest()
	{
		HashSet set1 = new HashSet();
		set1.add("Suman");
		set1.add(1234);
		set1.add(null);
		set1.add(null);
		set1.add(3.5);
		set1.add(12324);
		
		System.out.println(set1);
		System.out.println(set1.contains("SUMAN"));
		set1.remove(null);
		System.out.println(set1);
		set1.isEmpty();
		System.out.println("**************************************************");
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		HashSet set2 = new HashSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
	
	//	set1.addAll(set2);//Union
		
	//	set1.retainAll(set2); //intersection
		
	//	set1.removeAll(set2); // difference
		
		System.out.println(set1.containsAll(set2));
		
		System.out.println(set1); 
		
		
		for (Object o: set1)
		{
			System.out.println(o);
		}
		System.out.println("**************************************************");
		Iterator i = set2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(set1.contains(3));
		
		
				
	}
}
