package super_Concept;

public class Super_Use1 extends Super_Use1a
{
	int i = 20;
	public static void main(String[] args) 
	{
		Super_Use1 obj = new Super_Use1();
		obj.add(30);
	}
	
	public void add(int i)
	{
		System.out.println(i);		//30
		System.out.println(this.i);	//20
		System.out.println(super.i);//10
	}
}
