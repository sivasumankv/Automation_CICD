package ArraysAndCollections;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class QueuePractise {
	
	@Test
	public void QueueTest()
	{
		PriorityQueue pq =new PriorityQueue();
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("D"); //Add element, Exception if not aadded
		pq.offer("E"); // Add element, return False if not successfull 
		
		System.out.println(pq);
	
		//System.out.println(pq.element());// returns the Head Element, Exception if queue is empty
		//System.out.println(pq.peek()); // returns the Head Element, null if queue is empty
		
		System.out.println(pq.remove()); 
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
