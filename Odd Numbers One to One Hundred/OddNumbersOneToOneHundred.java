class OddNumbersOneToOneHundred
{
	public static void main(String []args)
	{
		//Repeat 1 - 100 odd only
		for(int _counter = 1; _counter <= 100; _counter++)
		{
			//if _counter % 2 != 0
			if(_counter % 2 != 0)
				//output _counter
				System.out.println(_counter);
		}
	}
}