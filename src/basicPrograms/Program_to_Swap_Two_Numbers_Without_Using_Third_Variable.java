package basicPrograms;

import java.util.Scanner;

public class Program_to_Swap_Two_Numbers_Without_Using_Third_Variable 
{
	public static void main(String[] args)
	{
		System.out.println("Enter 1st number");
		Scanner scan =new Scanner(System.in);
		int number1 = scan.nextInt();
		System.out.println("Enter 2nd number");
		int number2 = scan.nextInt();
		System.out.println("Before swapping the values are : "+number1+" ,"+number2);
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After swapping the values are : "+number1+" ,"+number2);
		scan.close();
	}
}
