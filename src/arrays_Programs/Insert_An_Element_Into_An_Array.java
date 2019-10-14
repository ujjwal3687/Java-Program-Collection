package arrays_Programs;

import java.util.Scanner;

public class Insert_An_Element_Into_An_Array 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the element you want to insert in a list");
		Scanner scan  = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("Enter the position at which you want to insert to list");
		int position = scan.nextInt();
		int[] a = {10,20,30,40,50};
		System.out.println("Before inserting values in the list are:");
		for(int i : a)
		{
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("After inserting values in the list are:");
		for(int i=a.length-1; i>=1; i--)
		{
			a[i] = a[i-1];
			if(i==position)
			{
				a[i-1] = number;
				break;
			}
		}
		
		for(int i : a)
		{
			System.out.print(i + ",");
		}	
		scan.close();
	}
}
