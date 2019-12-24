package arrays_exercises;

/*
 * Jaon Matthew Wiley
 * 12/172019
 * Arrays Exercises Application
 * 
 * array of 10 elements print only alternate elements, print sum of the even elements, print 
 * sum of odd elements
 */

public class ArraysExercisesTest 
{
	public static void main(String[] args)
	{
		ArraysExercises arraysExercises = new ArraysExercises();
		
		int randomNubers[] = new int[10];
		int total = 0;
		
		generateRandomNumbers(arraysExercises, randomNubers);
		addEven(randomNubers, total);
		System.out.println("\n");
		addOdd(randomNubers, total);
	}
	private static void addOdd(int[] randomNubers, int total) 
	{
		for (int i = 0; i < randomNubers.length; i++) 
		{
			if(i % 2 != 0) 
			{
				System.out.println(randomNubers[i]);
				total += randomNubers[i];
			}
		}
		System.out.printf("Sum of Arrays Odd Index: %s", total);
	}
	private static void generateRandomNumbers(ArraysExercises arraysExercises, int[] randomNubers) 
	{
		for(int counter = randomNubers.length - 1; counter >= 0; counter--) 
		{
			randomNubers[counter] = arraysExercises.RandomNumber(100);
		}
	}
	private static void addEven(int[] randomNubers, int total)
	{
		for (int i = 0; i < randomNubers.length; i++) 
		{
			if(i % 2 == 0)
			{
				System.out.println(randomNubers[i]);
				total += randomNubers[i];
			}
		}
		System.out.printf("Sum of Arrays Even Index: %s", total);
	}
}