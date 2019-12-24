class SumOfOneToOneHundred
{
	public static void main(String []args)
	{

		//stored variables
		int _total = 0;

		//Repeat 100 times
		for(int _counter = 100; _counter >= 1; _counter--)
		{
			//calculate _total += _counter
			_total += _counter;
		}
		
		//output _total
		System.out.println(_total);	
	}
}