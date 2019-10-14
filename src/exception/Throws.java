package exception;

import java.io.FileNotFoundException;

public class Throws extends Parent_Class
{
	public static void main(String[] args) 
	{
		Throws obj = new Throws();
		try 
		{
			obj.read_file();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			obj.write_file();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Test");
	}
}
