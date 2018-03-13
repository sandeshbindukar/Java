public class Calculator 
{
	public Calculator()
	{
		System.out.println("Creating Calculator");
	}
	
	public Calculator(String name)
	{
		System.out.println("Creating Calculator "+name);
	}
	
	public  int add(int a, int b)
	{
		int result= a+b;
		return result;
		
	}
	public int sub(int a, int b)
	{
		int result= a-b;
		return result;
		
	}
}
