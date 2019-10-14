package arrays_Programs;

public class Print_the_Number_of_Odd_and_Even_Numbers_Sum_and_Count_of_Even_or_Odd_Numbers_in_an_Array 
{
	public static void main(String[] args) 
	{
		int[] a = {10,13,15,20,1,4,8,9,16,14,17};
		System.out.println("Even numbers in the Array is: ");
		int even_counter = 0, odd_counter = 0, even_sum = 0, odd_sum = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				even_counter++;
				even_sum = even_sum + a[i];
				System.out.println(a[i]);
			}
		}
		System.out.println("Total number of even number in the list are: "+even_counter);
		System.out.println("Total sum of even number in the array is: "+even_sum);
		System.out.println("Odd numbers in the Array is: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 2 != 0)
			{
				odd_counter++;
				odd_sum = odd_sum + a[i];
				System.out.println(a[i]);
			}
		}
		System.out.println("Total number of even number in the list are: "+odd_counter);
		System.out.println("Total sum of even number in the array is: "+odd_sum);
	}
}
