package arrays_Programs;

import java.util.Scanner;

public class ArmsStrong 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to be checked for Armstrong Number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp1 = number;
		int temp2 = number;
		int counter = 0, remainder, arms = 0;
		
		while(temp1!=0)
		{
			counter++;
			temp1 = temp1 / 10;	
		}
		
		while(temp2 !=0)
		{
			int result = 1;
			remainder = temp2 % 10;
			for(int i=1; i<=counter; i++)
			{
				result = result * remainder;
			}
			arms = arms + result;
			temp2 = temp2 /10;	
		}		
		scan.close();
	}
}
