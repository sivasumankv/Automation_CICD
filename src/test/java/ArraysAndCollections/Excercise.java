package ArraysAndCollections;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Excercise {

	@Test
	public void countNumbers()
	{
		int[] nums = {3,5,7,9,3,6,1,9,5,3,10,5,3};
		
		HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if (count.containsKey(nums[i]))
			{
				count.put(nums[i], count.get(nums[i])+1);
			}
			else
			{
				count.put(nums[i],1);
			}
		}
		
		System.out.println(count);
	}
}
