package Loops_Arrays;

public class Loops
{
	public static void main(String[] args)
	{
		// ============================================================================================
		// Factorial (while) loop

		int kVal = 5;
		int factorial = 1;
		int kValInitial = kVal;

		while (kVal > 1)
		{
			// storing the current factorial value
			// factorial is the value of the number we calculate the factorial for
			// times each decimal number below it

			factorial *= kVal;
			kVal -= 1;
		}

		System.out.printf("Factorial of %d is equal to: %d\n", kValInitial, factorial);
		// ============================================================================================
		// (do while) loop

		int iVal = 5;
		do
		{
			// does statements inside here at least once before checking condition at the
			// end
			System.out.printf("%d * 2 = %d\n", iVal, iVal *= 2);
		} while (iVal < 100);
		// ============================================================================================
		// (for) loop

		for (int aVal = 1; aVal < args.length; aVal *= 2)
			System.out.println(iVal);

	}
}
