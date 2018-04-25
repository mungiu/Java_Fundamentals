package Ex2302;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int positivesum = 0;
		int negativesum = 0;

		System.out.println("Please input x");
		int x = keyboard.nextInt();

		while (x != 0)
		{
			if (x > 0)
				positivesum += x;
			else if (x < 0)
				negativesum += x;

			System.out.println("Please input x again, (input 0 to stop)");
			x = keyboard.nextInt();
		}

		System.out.println("negativesum: " + negativesum + " posotivesum: " + positivesum);

	}
}
