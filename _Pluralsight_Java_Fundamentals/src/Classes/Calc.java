package Classes;

public class Calc
{
	public Calc()
	{
	}

	public Calc(double leftVal, char opCode, double rightVal)
	{
		calculateResult(leftVal, rightVal, opCode);
	}

	/** Sets the length of the results array */

	/** Adds result to current array index */

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

	/** Returns stored result under index */
}
