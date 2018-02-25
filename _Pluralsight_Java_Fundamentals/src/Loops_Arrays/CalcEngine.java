package Loops_Arrays;

public class CalcEngine
{
	public static void main(String[] args)
	{
		double[] leftValsArr = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] rightValsArr = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] opCodesArr = { 'd', 'a', 's', 'm' };
		double[] resultsArr = new double[opCodesArr.length];

		// how calculations take place based on chosen operand
		for (int i = 0; i < opCodesArr.length; i++)
		{
			// calculation choice
			switch (opCodesArr[i])
			{
			case 'a':
				resultsArr[i] = leftValsArr[i] + rightValsArr[i];
				break;
			case 's':
				resultsArr[i] = leftValsArr[i] - rightValsArr[i];
				break;
			case 'd':
				// making sure if user divides by zero we display "0"
				resultsArr[i] = rightValsArr[i] != 0.0d ? leftValsArr[i] / rightValsArr[i] : 0.0d;
				break;
			case 'm':
				resultsArr[i] = leftValsArr[i] * rightValsArr[i];
				break;
			default:
				System.out.println("Error - invalid operation code, please try again.");
				// making sure result is 0 if any error happens
				resultsArr[i] = 0;
				break;
			}
		}

		// printing out the result
		for (double theResult : resultsArr)
			System.out.println(theResult);
	}
}
