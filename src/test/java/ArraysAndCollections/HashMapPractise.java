package ArraysAndCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapPractise {
	
	@Test
	public void testPractise()
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101,"Suman");
		hm.put(103, "Kaashvi");
		hm.put(104,"Chaarvi");
		hm.put(102, "Geeta");
		
		
		System.out.println(hm);
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(107, "Prabhakar");
		hm1.put(106, "Madhavi");
		hm.putAll(hm1);
		System.out.println(hm);
		
		System.out.println(hm.containsKey(107));
		System.out.println(hm.containsKey(105));
		
		System.out.println(hm.containsValue("Madhavi"));
		System.out.println(hm.containsValue("MADHAVI"));
		
		Set<Integer> keySet = hm.keySet();
		System.out.println(keySet);
		
		Collection col = hm.values();		
		System.out.println(col);
		
		System.out.println(hm.entrySet());
		
		for (Entry<Integer, String> ent : hm.entrySet())
		{
			System.out.println(ent.getValue() + " " +ent.getKey());
		}
	}
	
	

}
