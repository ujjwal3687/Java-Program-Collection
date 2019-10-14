package arrays_Programs;

import java.util.HashSet;

public class How_to_Find_Common_Elements_in_Three_Arrays 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,10,20,30};
		int[] b = {20,20,60,80,30};
		int[] c = {0,15,4,20,30,30,30,60};
		boolean status;
		HashSet<Integer> HS1 = new HashSet<Integer>();
		HashSet<Integer> HS2 = new HashSet<Integer>();
		HashSet<Integer> HS3 = new HashSet<Integer>();
		HashSet<Integer> HS4 = new HashSet<Integer>();
		
		for(int i : a)
		{
			HS1.add(i);
		}
		
		for(int i : b)
		{
			HS2.add(i);
		}
		
		for(int i : c)
		{
			HS3.add(i);
		}
		
		for(int i: HS1)
		{
			status = HS2.add(i);
			if(status == false)
			{
				HS4.add(i);
			}
		}
		System.out.println("Common elements between 3 arrays are: ");
		for(int i : HS3)
		{
			status = HS4.add(i);
			if(status == false)
			{
				System.out.print(i + ",");
			}
		}	
	}
}
