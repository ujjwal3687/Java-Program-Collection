/*Static keyword is used for Memory management. It's used with the class level variable not with local variable. 
  It's used when any variable name value doesn't change through out the class.
  Here, variable name called "college_name"  */

package static_Concept;

public class Static_variable_Example 
{
	int emp_id;
	String emp_name; 
	static String college_name = "BIET"; 
	
	Static_variable_Example(int emp_id, String emp_name)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	public void show()
	{
		System.out.println("Values are : Emp_ID		:"+ emp_id);
		System.out.println("Values are : Emp_Name		:"+ emp_name);
		System.out.println("Values are : College_Name	:"+ college_name);
	}
	public static void main(String[] args) 
	{
		Static_variable_Example obj = new Static_variable_Example(1, "Ujjwal");
		obj.show();
		Static_variable_Example obj1 = new Static_variable_Example(2, "Nitya Rani");
		obj1.show();
	}
}
