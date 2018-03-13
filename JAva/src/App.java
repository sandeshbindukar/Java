
public class App {
	public static void main(String args[]) 
	{
		Calculator add1 = new Calculator();
		Calculator add2 = new Calculator("Srp");
		
		int sum =add1.add(12,13);
		System.out.println("Addition: "+sum);
		int sub =add1.sub(12,13);
		System.out.println("Subrtaction: "+sub);
		
		
}
}