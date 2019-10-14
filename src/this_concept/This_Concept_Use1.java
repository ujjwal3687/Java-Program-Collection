/* this keyword is used to refer current class instance variable. In below example, variable "i" is used as
   an instance variable. So to initialise the value of local variable to instance variable this keyword is used. 
   If it will not be used, it will print default value of data type variable  */
	
package this_concept;

public class This_Concept_Use1 
{
	int i;
	public static void main(String[] args) 
	{
		This_Concept_Use1 obj = new This_Concept_Use1();
		obj.add(20);
		obj.add1();
	}

	public void add(int i)
	{	
		i = i;
	}
	
	public void add1()
	{
		System.out.println(i);
	}
}
