package Ex1004;

import java.util.Scanner;

public class Ex1004
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int userInput = key.nextInt();

		do
		{
			System.out.println("How much should we add to your input? This will stop when you reach 100.");
			int userAdd = key.nextInt();
			if (userAdd > (100 - userInput))
				System.out.println("Input lower number");
			else
				userInput += userAdd;
		} while (userInput < 100);
		key.close();
		
		System.out.println("You reached 100");
	}
}
