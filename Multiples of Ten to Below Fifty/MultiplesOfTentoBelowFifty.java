class MultiplesOfTenToBelowFifty
{
	public static void main(String []args)
	{
		//Repeat 49 times 
		for(int _counter = 1; _counter < 50; _counter++)
		{
			//if _counter multiplying each number by 10 = 0 	
			if(_counter % 10 == 0)
				//output _counter
				System.out.println(_counter);
		}
	}
}