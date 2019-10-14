package oops_concept;

public class ClassB1 extends ClassC1
{
	public static void main(String[] args)
	{
		ClassB1 obj= new ClassB1();
		obj.multiply();						//Accessing ClassB1 method referring to ClassB1
		obj.test();							//Accessing ClassC1 method referring to ClassB1
		
		ClassC1 obj1= new ClassB1();		//Refeering to ClassC1, creating object of ClassB1
		obj1.test();						//Only parent class method can be accessed
		
		ClassC1 obj2= new ClassC1();		//Refeering to ClassC1, creating object of ClassC1
		obj2.test();						//Only parent class method can be accessed
	}
	public void multiply()
	{
		System.out.println("Test Class B1");
	}
}
