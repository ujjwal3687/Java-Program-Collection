package basicPrograms;

import java.util.Scanner;

public class Program_to_Reverse_a_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number you want to print their Reverse");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int reverse = number, remainder, result=0;
		
		while(reverse!=0)
		{
			remainder = reverse % 10;
			result = result * 10 + remainder;
			reverse = reverse / 10;
		}
		System.out.println("Reverse value of "+number+ " is : "+result );
		scan.close();
	}
}
