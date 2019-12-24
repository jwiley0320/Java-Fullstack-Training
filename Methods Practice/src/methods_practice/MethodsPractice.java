package methods_practice;

public class MethodsPractice 
{
	public static void main(String[] args) 
	{
		//method with two arguments power and base
		poweredBaseValue(2, 5);
		//method with one argument base (square)
		squaredBaseValue(5);
		//method with one argument base (cube)
		cubedBaseValue(15);
		//ATM method
		atm(50, 200);
	}
	
	private static void poweredBaseValue(int base, int power) 
	{
		System.out.printf("Base %s of Power %s: %s\n", base, power, (int)Math.pow(base, power));
	}
	private static void squaredBaseValue(int base)
	{
		System.out.printf("Base %s Squared: %s\n", base, (int)Math.pow(base, 2));
	}
	private static void cubedBaseValue(int base)
	{
		System.out.printf("Base %s Cubed: %s\n", base, (int)Math.pow(base, 3));
	}
	private static void atm(int deposit, int balance) 
	{
		System.out.printf("New Balance: $%s", balance + deposit);
	}
}