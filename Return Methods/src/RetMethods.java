
public class RetMethods {

	public static void main(String[] args) {

		//25/5 * 50 + 12 * 14 / 2
		System.out.println(add(multiply(divide(25,5), 50), (multiply(12, divide(14, 2)))));
	}
	
	public static int divide(int a, int b) 
	{
		int result = a/b;
		return result;
	}
	public static int multiply(int a, int b) 
	{
		int result = a * b;
		return result;
	}
	public static int add(int a, int b) 
	{
		int result = a + b;
		return result;
	}
}