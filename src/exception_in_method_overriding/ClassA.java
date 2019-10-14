package exception_in_method_overriding;

public class ClassA extends ClassB
{
	public static void main(String[] args) throws Exception  
	{
		ClassA obj = new ClassA();
		obj.add();					//Testing Add
		obj.add1();					//Testing Add1
		obj.sub();					//Testing Sub
		obj.sub1();					//Testing Sub1
		obj.mul();					//Testing Multiply ClassB
		System.out.println("**************************************************");
		
		ClassB obj1 = new ClassB();
		obj1.add();					//Testing Add ClassB
		obj1.sub();					//Testing Sub ClassB
		obj1.mul();					//Testing Multiply ClassB
		System.out.println("**************************************************");
		
		ClassB obj2 = new ClassA();
		obj2.add();					//Testing Add
		obj2.sub();					//Testing Sub
		obj2.mul();					//Testing Multiply ClassB
	}
	
	public void add() throws RuntimeException
	{
		System.out.println("Testing Add");
	}
	
	public void sub()
	{
		System.out.println("Testing Sub");
	}
	
	public void add1()
	{
		System.out.println("Testing Add1");
	}
	
	public void sub1()
	{
		System.out.println("Testing Sub1");
	}
}
