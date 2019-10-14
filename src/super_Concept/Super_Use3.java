package super_Concept;

public class Super_Use3 extends Super_Use3a
{
	Super_Use3()
	{
		super();					//If we will not provide super(), then automatically compiler will add super() and will provide the same result
		System.out.println("Constructor call in Child Class");
	}
	public static void main(String[] args) 
	{
		new Super_Use3();
	}
}
