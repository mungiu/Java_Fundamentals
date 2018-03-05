package Test_1;

import java.util.Scanner;

public class Power
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int n = -1;

		System.out.println("Input x");
		double x = keyboard.nextDouble();

		while (n < 0)
		{
			System.out.println("Input positive integer");
			n = keyboard.nextInt();
		}

		System.out.println("Input power to raise x by");
		int power = keyboard.nextInt();
		keyboard.close();

		for (int i = 1; i < power; i++)
		{
			x *= x;
		}
		System.out.printf("Results is %.0f\n", x);
	}
}
