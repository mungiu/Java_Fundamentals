package Ex801;

import java.util.Random;
import java.util.Scanner;

public class Ex801
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNr = new Random();

		int userGuessedNr;
		int randomNrToInt;

		System.out.println("Please input random number boundary and press enter.");
		int boundary = keyboard.nextInt();
		// implicit casting to int since int type can not be compared to Random type
		randomNrToInt = randomNr.nextInt(boundary);

		do
		{
			System.out.printf("Guess a number between \"0\" and %d\n", boundary);
			userGuessedNr = keyboard.nextInt();

			if (userGuessedNr < randomNrToInt)
				System.out.println("Guess higher");
			else if (userGuessedNr > randomNrToInt)
				System.out.println("Guess lower");
			else if (userGuessedNr == randomNrToInt)
				System.out.println("You guessd it");
		}
		while (userGuessedNr != randomNrToInt);
		
		keyboard.close();
	}
}
