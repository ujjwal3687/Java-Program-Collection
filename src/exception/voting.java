package exception;

import java.util.Scanner;

public class voting 
{
	int min_age = 18;
	public static void main(String[] args) 
	{
		voting obj = new voting();
		System.out.println("Enter the age of the voter");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		try
		{
			if(age < obj.min_age)
			{
				throw new User_Defined_Exception("Not eligible for vote");
			}
			else
			{
				System.out.println("You can vote successfully");
			}
		}
		catch(User_Defined_Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Hello Test");
		scan.close();
	}
}
