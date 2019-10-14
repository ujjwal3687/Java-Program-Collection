package exception;

import java.io.FileNotFoundException;

public class test 
{
	public static void main(String[] args) 
	{
		int a;
		try
		{
			a = 1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("1");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("2");
		}
		
		finally
		{
			System.out.println("3");
		}
	}
}
