package arrays_Programs;

public class Find_Maximum_and_Minimum_values_in_an_Array 
{
	public static void main(String[] args) 
	{	
		int[] a = {10,20,130,0,40,50};
		int max =a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Largest value in Array is : "+max);
		int[] b = {110,120,30,0,70,150};
		int min = b[0];
		for(int i=1; i<b.length;i++)
		{
			if(b[i] < min)
			{
				min = b[i];
			}
		}
		System.out.println("Smallest value in Array is : "+min);
	}
}
