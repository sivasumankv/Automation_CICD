package ArraysAndCollections;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class ArraysPractise {
	
	@Test
	public void Small()
	{
		int[] a = new int[5];
		int[] ab = {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			a[i] = i*i;
		}
		int i=0;
		while(i<a.length)
		{
		System.out.println(a[i]);
		i++;
		}
	}
	
	@Test
	public void FindSmallest()
	{
		int [][] a = {{3,5,2},{-2,9,3},{5,8,-9}};
		int min = a[0][0];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				if (a[i][j]<min)
					min = a[i][j];
			}
		}
		
		System.out.println("minimum value : "+min);
	}
	
	@Test
	public void DateFunctions()
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yy HH:MM:SS");
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
	}

}

