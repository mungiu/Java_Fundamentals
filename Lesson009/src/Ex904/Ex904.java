package Ex904;

import java.util.Scanner;

public class Ex904
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Please input nr to calculate fibonaci list till: ");
		int input = key.nextInt();
		key.close();

		// creating array of pre defined size
		int[] results = new int[input];

		// calculating
		resultToArray(input, results);

		// printing out array
		for (int r : results)
			System.out.println(r);

	}

	/** Calculates fibonaci number of input */
	public static int fibonaciResult(int input)
	{
		int result = 0;
		if (input == 0 || input == 1)
			result = 1;
		else if (input == 2)
			result = 2;
		else if (input > 2)
			for (int x = input - 2; x < input; x++)
				result += x;
		else
			System.out.println("Please input positive number");

		return result;
	}

	/** Adds result to indicated array */
	public static void resultToArray(int input, int[] results)
	{
		for (int i = 0; i < input; i++)
			results[i] = fibonaciResult(i);
	}
}
