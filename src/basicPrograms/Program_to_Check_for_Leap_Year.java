package basicPrograms;

import java.util.Scanner;

public class Program_to_Check_for_Leap_Year 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the year to be checked for Leap Year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if(year <=0)
		{
			System.out.println("Invalid Input!!!!!!!!!!!");
		}
		else
		{
			if((year % 400 == 0)||((year % 4 == 0) && (year % 100 != 0)))
			{
				System.out.println(year + " is a Leap year");
			}
			else
			{
				System.out.println(year + " is not a Leap year");
			}
		}
		scan.close();
	}
}
