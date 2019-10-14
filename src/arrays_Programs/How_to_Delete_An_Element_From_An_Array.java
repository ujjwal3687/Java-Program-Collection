package arrays_Programs;

import java.util.Scanner;

public class How_to_Delete_An_Element_From_An_Array 
{
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		int[] a = {10,20,30,40,50};
		System.out.println("Enter the number which you want to delete from the list");
		int number = scan.nextInt();
		int position = 0, flag = 0;
		System.out.println("Before deleting, the values in the lists are: ");
		for(int i : a)
		{
			System.out.print(i + ",");
		}
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == number)
			{
				flag = 1;
				position = i;
				break;
			}
			else
			{
				flag = 0;
			}
		}
		if(flag == 1)
		{
			System.out.println("After deleting the values in the lists are: ");
			for(int i=position; i<a.length-1; i++)
			{
				a[i] = a[i+1];
			}
			for(int i=0; i<a.length-1; i++)
			{
				System.out.print(a[i] + ",");
			}
		}
		else
		{
			System.out.println("No matching element found to be deleted");
		}	
		scan.close();
	}
}
