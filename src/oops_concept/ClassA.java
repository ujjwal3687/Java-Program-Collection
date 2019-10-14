package oops_concept;

public class ClassA extends ClassB
{
	public static void main(String[] args) 
	{
		ClassA obj = new ClassA();			//Accessing both ClassB as well as ClassA method referring to ClassA object
		obj.add();							//Accessing ClassA method
		obj.sub();							//Accessing ClassB method
		ClassB obj1 = new ClassB();	
		obj1.sub();							//Accessing only ClassB method referring to ClassB object
		ClassB obj2 = new ClassA();			//Accessing only ClassB method referring to ClassB object
		obj2.sub();
	}
	
	public void add()
	{
		System.out.println("Add class A");
	}
}
