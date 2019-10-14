package oops_concept;

public class ClassC1 
{
	public static void main(String[] args) 
	{
		ClassC1 obj = new ClassC1();
		obj.test();						//Accessing ClassC1 method only referring to ClassC1 object	
	}

	public void test()
	{
		System.out.println("Test Class C1");
	}
}
