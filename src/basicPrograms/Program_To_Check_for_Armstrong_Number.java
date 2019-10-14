package basicPrograms;

import java.util.Scanner;

public class Program_To_Check_for_Armstrong_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to be checked for Armstrong Number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		//Step1 : To calculate the length of given number
		int length_count = 0,  temp1 = number, remainder, temp2 = number, arms = 0;
		while(temp1!=0)
		{
			remainder = temp1 % 10;
			length_count++;
			temp1 = temp1 / 10;
		}
		
		//Step2 : Calculate the sum of exponential power of each digit
		while(temp2!=0)
		{
			int result = 1;
			remainder = temp2 % 10;
			for(int i=1; i<=length_count; i++)
			{
				result = result * remainder;
			}
			arms = arms + result;
			temp2 = temp2 / 10;
		}
		
		if(arms == number)
		{
			System.out.println(number + " is an Armstrong Number");
		}
		else
		{
			System.out.println(number + " is not an Armstrong Number");
		}
		scan.close();
	}
}
