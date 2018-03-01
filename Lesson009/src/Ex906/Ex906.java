package Ex906;

import java.util.Random;
import java.util.Scanner;

public class Ex906
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner key = new Scanner(System.in);
		boolean guessed = false;
		int attempts = 0;

		System.out.println("Please input maximum number: ");
		int randomNr = rand.nextInt(key.nextInt());

		System.out.println("Please guess the number");
		do
		{
			attempts++;
			int guessedNr = key.nextInt();

			if (guessedNr > randomNr)
				System.out.println("Guess lower");
			else if (guessedNr < randomNr)
				System.out.println("Guess higher");
			else if (guessedNr == randomNr)
			{
				System.out.println("You guessed it");
				System.out.printf("You used %d attempts", attempts);
				guessed = true;
			}
		} while (!guessed);

		key.close();
	}
}
