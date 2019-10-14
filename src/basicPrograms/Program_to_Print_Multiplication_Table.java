package basicPrograms;

import java.util.Scanner;

public class Program_to_Print_Multiplication_Table 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number you want to print multiplication table");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(number + " * " + i + " = " + (number*i) );
		}
		scan.close();
	}
}
