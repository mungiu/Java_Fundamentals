package Ex1703;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery
{
	int[] lotteryNumbers = new int[5];

	public Lottery()
	{
		for (int i = 0; i < lotteryNumbers.length; i++)
			lotteryNumbers[i] = ThreadLocalRandom.current().nextInt(0, 10);
	}

	public int numberOfMatchedResults(int[] fiveInts)
	{
		int matched = 0;
		for (int i = 0; i < fiveInts.length; i++)
			if (fiveInts[i] == lotteryNumbers[i])
				matched++;

		if (matched < fiveInts.length)
			return matched;
		else
			System.out.println("You won, all numbers matched. Numbers matched: "); 
		
		return matched;
	}

	public int[] lotteryNumbersCopy()
	{
		int[] copyArr = new int[lotteryNumbers.length];

		for (int i = 0; i < copyArr.length; i++)
			copyArr[i] = lotteryNumbers[i];

		return copyArr;
	}
}
