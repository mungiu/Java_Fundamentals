package Ex901;

import java.util.Scanner;

public class Ex901
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Please input a number and press enter: ");
		int userInput = key.nextInt();
		key.close();

		// counting back
		for (int i = userInput; i >= 0; i--)
			System.out.println(i);

		// counting forward
		// NOTE: a new i is used by default
		System.out.println();
		for (int i = 0; i <= userInput; i++)
			System.out.println(i);

		// Almost all possible binary values to n
		System.out.println();
		for (int i = 2; i < userInput; i *= 2)
			System.out.println(i);

		// All possible binary values to n
		System.out.println();
		for (int i = 0; i < userInput; i *= 2)
		{
			while (i < 2)
			{
				System.out.println(i);
				i++;
			}
			System.out.println(i);
		}
	}
}
