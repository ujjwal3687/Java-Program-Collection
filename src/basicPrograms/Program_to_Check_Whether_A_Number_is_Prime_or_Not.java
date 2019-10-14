package basicPrograms;

import java.util.Scanner;

public class Program_to_Check_Whether_A_Number_is_Prime_or_Not 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to be checked for Pallindrome");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean status = false;
		if(number < 0)
		{
			System.out.println("Invalid input");
		}
		else if((number == 0)||(number == 1))
		{
			System.out.println(number + " is not a Prime number");
		}
		else
		{
			for(int i=2; i<=number/2; i++)
			{
				if(number % i == 0)
				{
					status = true;
					break;
				}
			}
			if(status == false)
			{
				System.out.println(number + " is a Prime number");
			}
			else
			{
				System.out.println(number + " is not a Prime number");
			}
		}
		scan.close();
	}
}
