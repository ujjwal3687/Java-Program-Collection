/* this keyword is used to invoke current class Method. */

package this_concept;

public class This_Concept_Use2 
{
	public static void main(String[] args) 
	{
		This_Concept_Use2 obj = new This_Concept_Use2();
		obj.display();
	}
	
	public void display()
	{
		show();				//If we won't use this keyword here, compiler will automatically add this keyword here
		this.show();		//Using this keyword implicitly, we can achieve same flow what we achieve without this.
	}
	
	public void show()
	{
		System.out.println("Test Show");
	}
}
