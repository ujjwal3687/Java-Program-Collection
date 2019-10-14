package basicPrograms;

import java.util.Scanner;

public class Program_to_Find_the_Factorial_of_the_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for which needs to know the factorial");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number < 0)
		{
			System.out.println("Invald Input!!!!!!!!!!!!");
		}
		else if(number == 0)
		{
			System.out.println("Factorial value of "+number+ " is : 1");
		}
		else
		{
			int result = 1;
			for(int i=2; i<=number; i++)
			{
				result = result * i;
			}
			System.out.println("Factorial value of "+number + " is : "+ result);
		}
		scan.close();
	}
}
