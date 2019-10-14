package oops_concept;

public class MyInterface1 implements MyInterface
{
	public static void main(String[] args) 
	{
		MyInterface1 obj = new MyInterface1();
		obj.add();
		System.out.println(obj.sum());
	}

	@Override
	public void add() 
	{
		System.out.println("Ujjwal");
	}

	@Override
	public int sum()
	{
		System.out.println("Kumar");
		return 0;
	}

}
