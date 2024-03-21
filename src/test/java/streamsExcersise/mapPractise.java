package streamsExcersise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class mapPractise {

	@Test
	public void method1()
	{
		
	
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Hello");
	al.add("Hai");
	al.add("ABCD");
	al.add("another");
	al.add("Mine");
/*	
	al.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
	System.out.println("*****************************");
	al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	Stream.of("Suman","Kaashvi","Geeta","Chaarvi").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	System.out.println("*****************************");
	
	*/
	
	List<String> t = Arrays.asList("Venkata","Siva","Suman","Kondapalli","Lakshmi","Geetanjali","Kaashvi","Chaarvi");
	t.stream().filter(s->s.endsWith("i")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	System.out.println("*****************************");
	Stream.concat(Stream.of("Madhavi","Prabhakar"), t.stream()).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	
	System.out.println("*****************************");
	boolean flag = t.stream().anyMatch(s->s.equalsIgnoreCase("Siva"));
	
	System.out.println(flag);
	
	
	}
	
	@Test
	public void method2()
	{
		List<String> ls = Stream.of("Venkata","Siva","Suman","Kondapalli","Lakshmi","Geetanjali","Kaashvi","Chaarvi").sorted().collect(Collectors.toList());
		
		System.out.println(ls);
		
		List<Integer> num = Arrays.asList(1,3,5,3,2,1,6,9,7,7,6);
		num.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		ls.stream().filter(x->x.contains("vi")).sorted().forEach(z->System.out.println(z));
		
		
		
	}
	
	
}
