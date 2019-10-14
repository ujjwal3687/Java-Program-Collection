package basicPrograms;

import java.util.Scanner;

public class Program_to_Print_All_Prime_Numbers_between_1_to_100 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the lower range of the series");
		Scanner scan = new Scanner(System.in);
		int lr = scan.nextInt();
		System.out.println("Enter the lower range of the series");
		int ur = scan.nextInt();
		boolean status = false;
		System.out.println("All Prime numbers between "+lr+ " &" + ur + " are : ");
		for(int i=lr; i<=ur; i++)
		{
			for(int j=2; j<=i/2 ; j++)
			{
				if(i % j == 0)
				{
					status = true;
					break;
				}
				else
				{
					status = false;
				}
			}
			if(status == false)
			{
				if(i!=1)
				{
					System.out.println(i);
				}	
			}
		}	
		scan.close();
	}
}
