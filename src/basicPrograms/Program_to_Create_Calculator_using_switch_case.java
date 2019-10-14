package basicPrograms;

import java.util.Scanner;

public class Program_to_Create_Calculator_using_switch_case 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		System.out.println("Enter the Operator like +,-, *, /, %");
		String operator = scan.next();
		System.out.println("Enter the second number");
		int number2 = scan.nextInt();
		
		switch(operator)
		{
			case "+" : System.out.println("The result of addition of "+number1+ " & "+ number2 + " is :"+(number1+number2));
			break;
			
			case "-" : System.out.println("The result of substraction of "+number1+ " & "+ number2 + " is :"+(number1-number2));
			break;
			
			case "*" : System.out.println("The result of multiplication of "+number1+ " & "+ number2 + " is :"+(number1*number2));
			break;
			
			case "/" : System.out.println("The result of division of "+number1+ " & "+ number2 + " is :"+(number1 / number2));
			break;
			
			case "%" : System.out.println("The result of remainder of "+number1+ " & "+ number2 + " is :"+(number1 % number2));
			break;
			
			default : System.out.println("Invalid Operator");
		}
		scan.close();
	}
}
