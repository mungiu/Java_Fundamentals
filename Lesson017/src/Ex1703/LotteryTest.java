package Ex1703;

import java.util.Scanner;

public class LotteryTest
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		Lottery lottery1 = new Lottery();
		int[] userInputs = new int[5];

		System.out.println("Please input you 5 lottery numbers");
		for (int i = 0; i < userInputs.length; i++)
			userInputs[i] = key.nextInt();
		
		key.close();
		
		System.out.println(lottery1.numberOfMatchedResults(userInputs));
		System.out.println(lottery1.lotteryNumbersCopy());
	}
}
