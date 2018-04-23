package Ex2204;

import java.util.Arrays;

public class TestScores
{
	private double[] testScores;

	public TestScores(double[] testScores)
	{
		for (int i = 0; i < testScores.length; i++)
			if (testScores[i] <= 0 || testScores[i] >= 100)
				throw new IllegalArgumentException("Invalid grades");
			else
				this.testScores = Arrays.copyOf(testScores, testScores.length);
	}

	public double getAverage()
	{
		return Arrays.stream(testScores).sum() / testScores.length;
	}
}
