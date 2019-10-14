package arrays_Programs;

public class Merge_Two_Arrays 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50,60};
		int[] b = {70,80,90,100,110};
		int[] temp = new int[(a.length+b.length)];
		
		for(int i=0; i<a.length; i++)
		{
			temp[i] = a[i];
		}
		
		for(int j=0; j<b.length; j++)
		{
			temp[j + a.length] = b[j];
		}
		
		System.out.println("After merging the values of arrays are: ");
		for(int i: temp)
		{
			System.out.print(i + ",");
		}
	}
}
