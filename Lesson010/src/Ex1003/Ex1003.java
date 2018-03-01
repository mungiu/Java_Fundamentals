package Ex1003;

import java.text.DecimalFormat;

public class Ex1003
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat(".00000");

		double pI = 1;
		int currentIteration = 0;
		int denominator = 3;

		boolean plus = false;
		boolean minus = true;

		System.out.println("Calculating pI");

		do
		{
			if (minus)
			{
				pI -= (1.0 / denominator);
				plus = true;
				minus = false;
			} else if (plus)
			{
				pI += (1.0 / denominator);
				plus = false;
				minus = true;
			}

			denominator += 2;
			currentIteration++;
		} while (!df.format(pI * 4).equals(df.format(Math.PI)));

		System.out.println(df.format(pI * 4));
		System.out.printf("Iterations amount: %d", currentIteration);
	}
}
