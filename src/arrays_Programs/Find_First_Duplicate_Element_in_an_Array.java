package arrays_Programs;

import java.util.HashSet;

public class Find_First_Duplicate_Element_in_an_Array 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,60,90,30,40,40,50,60};
		boolean status;
		HashSet<Integer> HS = new HashSet<Integer>();
		System.out.println("First duplicate element in the list is: ");
		for(int i=0; i<a.length; i++)
		{
			status = HS.add(a[i]);
			if(status == false)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
}
