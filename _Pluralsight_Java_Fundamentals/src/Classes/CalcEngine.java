package Classes;

public class CalcEngine
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();

		calculateAndSave(calc, 10, '*', 20, 1);
		calculateAndSave(calc, 100, '*', 20, 2);
		calculateAndSave(calc, 1000, '*', 20, 3);

		calc.printResults();

	}

	private static void calculateAndSave(Calculator calc, double leftVal, char opCode, double rightVal,
			int arrayLength)
	{
		calc.setResultsArrLength(arrayLength);
		calc.addResultToArr(calc.calculateResult(leftVal, rightVal, opCode));
	}
}
