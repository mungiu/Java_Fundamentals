package Ex1004;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ex1004_1
{
	public static void main(String[] args)
	{
		NumberFormat decimals3 = new DecimalFormat("0.000");
		double numerator = 1;
		double denominator = 30;

		double[] doubleArr = new double[30];
		for (int i = 0; i < doubleArr.length; i++)
		{
			doubleArr[i] = numerator / denominator;
			numerator++;
			denominator--;
			System.out.println("Result: " + decimals3.format(doubleArr[i]));
			System.out.println();
		}

		System.out.println(sumArray(doubleArr));
	}

	public static double sumArray(double[] doubleArr)
	{
		double result = 0;
		for (int i = 0; i < doubleArr.length; i++)
			result += doubleArr[i];

		return result;
	}
}
