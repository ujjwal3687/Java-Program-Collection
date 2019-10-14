/*Types of Polymorphism : 
 	1. Compile Time Polymorphism also known as Static Polymorphism can be achieved through Method Overloading. It is 
 	   handled by Comiler.
 	2. Run Time Polymorphism also known as Dynamic Polymorphism can be achieved through Method Ridding.It is 
 	   handled by JVM.
 	   Following are the condition to achieve method overloading:-
 	   			a. More than 1 method with the Same Name
 	   			b. Should be available in the same class
 	   			c. Parameters should be changed i.e. change in number of Arguments /change in sequence of arguments 
 	     			/ Change in Type of Argument. If any of these criteria meet, we can achieve polymorphism.
        Following are the condition to achieve method overriding:-       
             	a. Method name should be same.
             	b. Class should be different
             	c. Same Arguments i.e. Number of Arguments / Sequence of Arguments / Type of Arguments can be same. */
package oops_concept;
public class Polymorphism_Concept 
{
	public static void main(String[] args) 
	{
		Polymorphism_Concept obj = new Polymorphism_Concept();
		obj.add();
		obj.add(20);
		obj.add("Ujjwal");
		obj.add(20, "Ujjwal");
		obj.add("Ujjwal" , 20);
	}
	public void add()
	{
		System.out.println("Addition");
	}
	public void add(int a, String b)
	{
		System.out.println("Addition Again");
	}
	public void add(String a, int b)
	{
		System.out.println("Addition Again");
	}
	public void add(int a)
	{
		System.out.println("Addition");
	}
	public void add(String a)
	{
		System.out.println("Addition");
	}
}
