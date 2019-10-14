package basicPrograms;

import java.util.Scanner;

public class Program_to_Reverse_A_String 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String you want to print their Reverse");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String temp = str, reverse = "";
		for(int i=temp.length()-1; i>=0; i--)
		{
			reverse = reverse + temp.charAt(i);
		}
		System.out.println("Reverse value of "+str+" is: "+reverse);
		scan.close();
	}
}
