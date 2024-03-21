package ArraysAndCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeta");
		al.add("Kaashvi");
		al.add(0,"Suman");
		al.addLast("Chaarvi");
		al.addFirst("KONDAPALLI");
		System.out.println(al);
		System.out.print(al.indexOf("KONDAPALLI"));
		System.out.println(al.get(1));
		System.out.println(al.size());
		al.set(0, "Kondapalli");
	/*	
		for (int i=0;i<=al.size();i++)
		{
			System.out.println(al.get(i));
		}
	*/	
		
		for( String s: al)
		{
			System.out.println(s);
		}
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		String[] parents = {"Prabhakar","Madhavi"};
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	
	}

}
