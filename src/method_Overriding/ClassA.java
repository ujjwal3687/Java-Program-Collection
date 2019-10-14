package method_Overriding;

public class ClassA extends ClassB
{
	public static void main(String[] args) 
	{
		ClassA obj1 = new ClassA();
		obj1.add("u");					//Add Method in Class A
		obj1.add1();				//Add1 New Method in Class A
		obj1.add2();				//Add2 New Method in Class B
		obj1.add3();				//Add3 New Method in Class A
		obj1.add4();				//Add4 New Method in Class A	
		System.out.println("*********************************************");
		ClassB obj2 = new ClassB();
		obj2.add("y");					//Add Method in Class B
		obj2.add1();				//Add1 New Method in Class B
		obj2.add2();				//Add2 New Method in Class B	
		System.out.println("*********************************************");
		ClassB obj3 = new ClassA();
		obj3.add("u");					 //Add Method in Class A
		obj3.add1();				//Add1 New Method in Class A	
		obj3.add2();				//Add2 New Method in Class B
		System.out.println("*********************************************");
	}
	
	public String add(String a)
	 {
		System.out.println("Add Method in Class A");
		return null;
	 }
	
	public StringBuffer add1()
	{
		System.out.println("Add1 New Method in Class A");
		return null;
	}
	
	public void add3()
	{
		System.out.println("Add3 New Method in Class A");
	}
	
	public void add4()
	{
		System.out.println("Add4 New Method in Class A");
	}
}
