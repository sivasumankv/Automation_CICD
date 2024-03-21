package streamsExcersise;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class practise1 {
	
	@Test
	public void test()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Venkata");
		al.add("Siva");
		al.add("Suman");
		al.add("Kondapalli");
		al.add("Lakshmi");
		al.add("Geetanjali");
		
	/*	int count=0;
		for(int i=0;i<al.size();i++)
		{
			String a = al.get(i);
			if (a.startsWith("S"))
			{
				count++;
			}
		}
		System.out.println(count); */
		
		Long c = al.stream().filter(s->s.startsWith("S")).count();
		System.out.println(c);
		
		Long d =	Stream.of("Suman","Kondapalli","Siva","Venkata").filter(s->s.startsWith("S")).count();
		
		
		
		/*
	Long d =	al.stream().filter(s->
		{
			s.startsWith("S");
			//return true;
		}).count();
		*/
	System.out.println(d);
	
	
	//al.stream().filter(t -> t.contains("S")).forEach(t -> System.out.println(t));
	
	al.stream().filter(s->s.length()>7).forEach(k->System.out.println(k));
	
	al.stream().filter(s->s.length()>7).limit(1).forEach(j->System.out.println(j));
	}
	
	

}
