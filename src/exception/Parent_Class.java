package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Parent_Class 
{
	public void read_file() throws FileNotFoundException
	{
		File f = new File("");
		FileInputStream FIS = new FileInputStream(f);
		try 
		{
			FIS.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void write_file() throws FileNotFoundException
	{
		File f = new File("");
		FileOutputStream FIS = new FileOutputStream(f);
		try 
		{
			FIS.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
