package basicPrograms;

import java.util.Scanner;

public class Program_to_Find_the_Factorial_of_the_Number_using_Recursion 
{
	static int result = 1;
	static int number;
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for which needs to know the factorial");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		fact(number);
		System.out.println("Factorial value of "+number+ " is : "+ result);
		scan.close();
	}
	
	public static void fact(int num)
	{
		result = result * num;
		if(num !=1)
		{	
			fact(num-1);
		}
	}
}
