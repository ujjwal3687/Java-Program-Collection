package oops_concept;

public class Object_Creation_and_Initialization 
{
	int a, z;
	String str;
	public static void main(String[] args) 
	{
		Object_Creation_and_Initialization obj = new Object_Creation_and_Initialization();
		obj.a = 10;
		obj.str = "Ujjwal";
		obj.test1(10,20);
	}

	public void test1(int x, int y)
	{
		z = x +y;
		System.out.println(z);
	}
}
