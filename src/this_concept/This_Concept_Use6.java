/*This keyword can be used as a Return type*/

package this_concept;

public class This_Concept_Use6 
{
	public static void main(String[] args) 
	{
		This_Concept_Use6 obj = new This_Concept_Use6();
		This_Concept_Use6 t =obj.add();
		System.out.println(t);
	}
	
	public This_Concept_Use6 add()
	{
		return this;	
	}
}
