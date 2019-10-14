package arrays_Programs;

import java.util.HashSet;

public class How_to_find_common_elements_from_two_arrays 
{
	public static void main(String[] args) 
	{
		boolean status;
		int[] a = {10,20,30,10,20,30,10,10};
		int[] b = {40,20,30,30,20,630,810,910};
		
		HashSet<Integer> HS1 = new HashSet<Integer>();
		HashSet<Integer> HS2 = new HashSet<Integer>();
		for(int i=0; i<a.length; i++)
		{
			HS1.add(a[i]);
		}
		
		for(int i=0; i<b.length; i++)
		{
			HS2.add(b[i]);
		}
		System.out.println("Common elements from two arrays are: ");
		for(int i : HS1)
		{
			 status = HS2.add(i);
			 if(status == false)
			 {
				 System.out.print(i + ",");
			 }	
		}
	}
}
