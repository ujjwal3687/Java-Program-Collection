/*Multilevel Inheritance */
package oops_concept;

public class ClassA1 extends ClassB1
{
	public static void main(String[] args) 
	{
		ClassA1 obj = new ClassA1();
		obj.multiply();					//Accessing all ClassA1 method,ClasB1 method as well as ClassC1 method 
		obj.divide();					//referring to ClassA1 object
		obj.test();						//referring to ClassA1 object
		System.out.println("***********************");
		ClassB1 obj2 = new ClassA1();
		obj2.multiply();
		obj2.test();
		System.out.println("***********************");
		ClassC1 obj3 = new ClassA1();
		obj3.test();
		System.out.println("***********************");
		ClassB1 obj4 = new ClassB1();
		obj4.multiply();
		obj4.test();
		System.out.println("***********************");
		ClassC1 obj5 = new ClassB1();
		obj5.test();
		System.out.println("***********************");
		ClassC1 obj6 = new ClassC1();
		obj6.test();
	}
	
	public void divide()
	{
		System.out.println("Test Class A1");
	}
}
