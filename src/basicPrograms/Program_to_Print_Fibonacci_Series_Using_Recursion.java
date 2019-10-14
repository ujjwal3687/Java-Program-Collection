package basicPrograms;

import java.util.Scanner;

public class Program_to_Print_Fibonacci_Series_Using_Recursion 
{
	static int a= 0, b=1, c;
	public static void main(String[] args) 
	{
		System.out.println("Enter the number you want to print");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.print(a + "," + b);
		fibonacci(number);
		scan.close();
	}
	
	public static void fibonacci(int num)
	{
		c = a + b;
		if(num-2!=0)
		{
			System.out.print("," + c);
			a = b;
			b = c;
			fibonacci(num-1);
		}
	}
}
