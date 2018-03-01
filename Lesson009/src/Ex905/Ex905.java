package Ex905;

import java.util.Scanner;

public class Ex905
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		boolean run = true;
		String userInput;

		do
		{
			System.out.println("Please input string and press enter:");
			userInput = key.nextLine();

			if (userInput.equals("quit"))
				run = false;
			else
			{
				for (int j = userInput.length(); j > 0; j--)
					System.out.print(userInput.charAt(j - 1));

				System.out.println();
			}
		} while (run);

		key.close();	
	}
}
