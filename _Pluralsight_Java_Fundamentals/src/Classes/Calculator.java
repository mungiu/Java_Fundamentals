package Classes;

import java.util.Arrays;

public class Calculator
{
	private int i = 0;
	private int arrayLength = 0;
	private double[] resultsArr = new double[arrayLength];

	/** Sets the length of the results array */
	public void setResultsArrLength(int _arrayLength)
	{
		resultsArr = Arrays.copyOf(resultsArr, _arrayLength);
	}

	/** Adds result to current array index */
	public void addResultToArr(double result)
	{
		if (i <= 10 && result != 0)
		{
			resultsArr[i] = result;
			i++;
		} else
			System.out.println("Results array is full, please increase limit");
	}

	/** Calculates the result */
	public double calculateResult(double leftVal, double rightVal, char opCode)
	{
		double _result;

		// calculation choice
		switch (opCode)
		{
		case '+':
			_result = leftVal + rightVal;
			break;
		case '-':
			_result = leftVal - rightVal;
			break;
		case '/':
			// making sure if user divides by zero we display "0"
			_result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
			break;
		case '*':
			_result = leftVal * rightVal;
			break;
		default:
			System.out.println("Error - invalid operation code, please try again.");
			// making sure result is 0 if any error happens
			_result = 0;
			break;
		}

		return _result;
	}

	/** Prints each result from resultsArr */
	public void printResults()
	{
		for (double r : resultsArr)
			System.out.println(r);
	}

	/** Returns stored result under index */
	public double getIndexValue(int index)
	{
		return resultsArr[index];
	}
}
