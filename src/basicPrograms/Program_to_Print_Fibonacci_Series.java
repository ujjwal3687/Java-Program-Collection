package basicPrograms;

import java.util.Scanner;

public class Program_to_Print_Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		int a = 0, b=1, c;
		System.out.println("Enter the number you want to print in series");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("Values in the series are :");
		if(number <=0)
		{
			System.out.println("Invalid Input!!!!!!!!!!");
		}
		else if(number == 1)
		{
			System.out.println(a);
		}
		else if(number == 2)
		{
			System.out.println(a + " ," + b);
		}
		else
		{
			System.out.print(a + "," + b);
			for(int i=1; i<=number-2; i++)
			{
				c = a+ b;
				System.out.print("," +c);
				a = b;
				b = c;
			}	
		}
		scan.close();
	}
}
