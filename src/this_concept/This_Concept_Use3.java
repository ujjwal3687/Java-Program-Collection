/* this keyword is used to invoke current class constructor */

package this_concept;

public class This_Concept_Use3 
{
	This_Concept_Use3()
	{
		System.out.println("Default no argument Constructor Calling");
	}
		
	This_Concept_Use3(int a)
	{
		this();
		System.out.println("Parameterised Constructor Calling");
	}
	
	public static void main(String[] args) 
	{
		new This_Concept_Use3(30);
	}
}
