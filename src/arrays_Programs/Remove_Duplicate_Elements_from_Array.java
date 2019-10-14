package arrays_Programs;

import java.util.HashSet;

public class Remove_Duplicate_Elements_from_Array 
{
	public static void main(String[] args) 
	{
		int[] a = {15,10,2,8,2,8,9,10,21};		//UnSorted Array
		HashSet<Integer> HS = new HashSet<Integer>();
		System.out.println("Original list value was:");
		for(int i=0; i<a.length; i++)
		{
			 System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.println("***************************************************************");
		System.out.println("After removing duplicates the value in the list is:");
		for(int i=0; i<a.length; i++)
		{
			HS.add(a[i]);
		}
		
		for(int i: HS)
		{
			System.out.print(i + ",");
		}
		HS.clear();
	}
}
