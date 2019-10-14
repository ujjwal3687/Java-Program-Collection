package oops_concept;

public interface MyInterface 
{
	void add(); 				//By default compiler will add public and Abstract keyword ahead if not added.
	
	public abstract int sum();
	
	int a = 10;					//By default, public static final keyword will be added to the variable if not given.
	public static final int x = 20;
	
	/*From java version 8 onwards, we can create concrete method (having body / implementation) inside interface
	  but access modifier will be default only */
	default void Testagain()
	{
		System.out.println("Test Again");
		System.out.println(a);
		System.out.println(x);
	}
	
	public static void multiply()
	{
		System.out.println("Multiply Again");
	}
	
	public static String multiply1()
	{
		System.out.println("Multiply Again1");
		return null;
	}
	
	/*From java version 9 onwards, we can create private method also inside interface */
	
	private void testing()
	{
		System.out.println("Testing");
	}
	
	private int testingnew()
	{
		System.out.println("Testing");
		return 0;
	}
	
}
