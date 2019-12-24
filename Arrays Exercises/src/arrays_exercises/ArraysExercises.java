package arrays_exercises;

import java.util.Random;

public class ArraysExercises 
{
	public int RandomNumber(int max)
	{
		Random random = new Random();
		int rand = random.nextInt(max);
		
		return rand;
	}
}