package basicPrograms;

import java.util.Scanner;

public class Program_To_Check_for_Palindrome_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to be checked for Pallindrome");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp = number, res = 0, remainder;
		while(temp !=0)
		{
			remainder = temp % 10;
			res = res * 10 + remainder;
			temp = temp /10;
		}
		if(res == number)
		{
			System.out.println(number +" is Pallindrome");
		}
		else
		{
			System.out.println(number +" is not Pallindrome");
		}
		scan.close();
	}
}
