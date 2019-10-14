/*1. Constructors are block of statement which is similar to methods and having the same name as that of 
     class name. 
  2. Constructor doesn't have return type not even void  
  3. Only public. private, protected and default access modifiers are allowed in the constructor
  4. It executes automatically when we create an object
  5. Ways to call the constructor. Their syntax are as follows:-
  		a. access_Modifier class ClassName = new ClassName();
  		b. new ClassName(); [No need to create reference]
  6. Constructor is used to initialise the object
  *************************************************************************************************************
  Types of Constructor:-
  1. Default constructor :- Constructor created by the compiler is known as Default Constructor. 
  	 Constructor created by compiler will always be a no-argument constructor. Compiler will create Constructor only
  	 when user have not created any constructor.  
  2. No-Argument constructor :- Constructor created by the user having no parameters are known as No-Argument 
     constructor.
  3. Parameterised Constructor :- Constructor created by the user having at least 1 parameters are known as 
     No-Argument constructor. 
  */

package oops_concept;

public class Constructors_Concept 
{
	int emp_id;
	String emp_name;
	Constructors_Concept()
	{
		int x = 10, y=20,z;
		z = x + y;
		System.out.println(z);
	}
	
	/*Constructors_Concept(int emp_id, String emp_name)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}*/
	public static void main(String[] args) 
	{
		/*Constructors_Concept obj = new Constructors_Concept(1, "Ujjwal");
		System.out.println(obj.emp_id);
		System.out.println(obj.emp_name);*/
		new Constructors_Concept();
	}
}
