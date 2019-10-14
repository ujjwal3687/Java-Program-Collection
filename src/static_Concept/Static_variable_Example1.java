package static_Concept;

public class Static_variable_Example1 
{
	int counter = 0;
	Static_variable_Example1()
	{
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) 
	{
		Static_variable_Example1 obj1 =  new Static_variable_Example1();
		Static_variable_Example1 obj2 =  new Static_variable_Example1();
		Static_variable_Example1 obj3 =  new Static_variable_Example1();
		Static_variable_Example1 obj4 =  new Static_variable_Example1();
	}
}
