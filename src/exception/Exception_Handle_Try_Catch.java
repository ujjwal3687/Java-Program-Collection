package exception;

public class Exception_Handle_Try_Catch 
{
	int a = 100, b = 0, c;
	public static void main(String[] args)
	{
		System.out.println("1");
		try
		{
			Exception_Handle_Try_Catch obj = new Exception_Handle_Try_Catch();
			System.out.println("2");
			obj.c = obj.a / obj.b;
			System.out.println("3");
			
		}
		catch (Exception exc) 
		{
			System.out.println("Unable to divide by zero");
		}
		finally
		{
			System.out.println("5");
		}
		System.out.println("6");
		System.out.println("********************");
		try
		{
			Exception_Handle_Try_Catch obj = new Exception_Handle_Try_Catch();
			System.out.println("12");
			obj.c = obj.a / obj.b;
			System.out.println("13");
			
		}
		catch (Exception exc) 
		{
			System.out.println("Unable to divide by zero");
		}
		finally
		{
			System.out.println("15");
		}
		System.out.println("10");
		System.out.println("**************************************");
		try
		{
			Exception_Handle_Try_Catch obj = new Exception_Handle_Try_Catch();
			int res = obj.divide(obj.a, obj.b);
			System.out.println("Result value is: "+res);
		}
		catch(Exception e)
		{
			System.out.println("Test");
		}
		finally
		{
			System.out.println("I am in final block");
		}
	}
	
	public int divide(int a, int b)
	{
		c = a / b;
		return c;
	}
	
	
}
