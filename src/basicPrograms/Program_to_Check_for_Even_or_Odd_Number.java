package basicPrograms;

import java.util.Scanner;

public class Program_to_Check_for_Even_or_Odd_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to be checked for even or odd");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number <=0)
		{
			System.out.println("Invalid Input!!!!!!!!!!");
		}
		else if(number % 2 == 0)
		{
			System.out.println(number + " is even");
		}
		else
		{
			System.out.println(number + " is Odd");
		}
		scan.close();
	}
}
