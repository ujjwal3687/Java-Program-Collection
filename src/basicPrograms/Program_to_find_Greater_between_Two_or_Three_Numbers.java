package basicPrograms;

import java.util.Scanner;

public class Program_to_find_Greater_between_Two_or_Three_Numbers 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		System.out.println("Enter the second number");
		int number2 = scan.nextInt();
		if(number1 > number2)
		{
			System.out.println(number1 + " is greater than "+number2);
		}
		else if(number1 < number2)
		{
			System.out.println(number1 + " is smaller than "+number2);
		}
		else
		{
			System.out.println(number1 + " is equal to "+number2);
		}
		System.out.println("************************************");
		System.out.println("Enter the third number");
		int number3 = scan.nextInt();
		if((number1 > number2)&&(number1 > number3))
		{
			System.out.println(number1 + " is greatest among "+number1 +" ," +number2 + " & " + number3);
		}
		else if(number2 > number3)
		{
			System.out.println(number2 + " is greatest among "+number1 +" ," +number2 + " & " + number3);
		}
		else
		{
			System.out.println(number3 + " is greatest among "+number1 +" ," +number2 + " & " + number3);
		}
		scan.close();
	}
}
