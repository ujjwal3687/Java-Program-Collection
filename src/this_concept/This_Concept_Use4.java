/*this keyword can be used to pass as an argument in the method call */

package this_concept;

public class This_Concept_Use4 
{
	public static void main(String[] args) 
	{
		This_Concept_Use4 obj = new This_Concept_Use4();
		obj.sub();
	}
	
	public void add(This_Concept_Use4 obj)
	{
		System.out.println("Add Method Called");
	}
	
	public void sub()
	{
		add(this);
		System.out.println("Sub Method Called");
	}
}
