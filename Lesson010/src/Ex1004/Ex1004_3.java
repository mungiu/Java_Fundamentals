package Ex1004;

import java.util.Scanner;

public class Ex1004_3
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int sum = 0;

		System.out.println("Give me a positive non zero integer value");
		int input = key.nextInt();

		while (input >= 0)
		{
			sum += input;
			input--;
		}

		System.out.println(sum);
	}
}
