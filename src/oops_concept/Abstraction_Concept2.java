package oops_concept;

public class Abstraction_Concept2 extends Abstraction_Concept
{
	public static void main(String[] args) 
	{
		Abstraction_Concept1 obj1 = new Abstraction_Concept1();
		obj1.add();
		obj1.add1();
		obj1.add2();
		System.out.println("********************");
		Abstraction_Concept2 obj2 = new Abstraction_Concept2();
		obj2.add();
		obj2.add1();
		obj2.add2();
		obj2.add3();
		obj2.add4();
	}
	
	@Override
	public void add() 
	{
		System.out.println("Test Abstraction_Concept2 Add");	
	}

	@Override
	public void add1() 
	{
		System.out.println("Test Abstraction_Concept2 Add1");
		
	}

	@Override
	public void add2() 
	{
		System.out.println("Test Abstraction_Concept2 Add3");
		
	}
	
	public void add3() 
	{
		System.out.println("Test Add 3");
	}
	
	public void add4() 
	{
		System.out.println("Test Add 4");
	}	
}
