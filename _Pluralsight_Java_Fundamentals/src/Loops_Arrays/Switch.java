package Loops_Arrays;

public class Switch
{
	public static void main(String[] args)
	{
		int testKey = 0;
		// static methods of a class can be accessed without creating an object of the class
		caseSwitch(testKey);
	}

	// Statics methods are blueprints themselves, they belong to the class
	// non-static methods belong to the object of the class
	public static String caseSwitch(int key)
	{
		switch (key)
		{
		case 0:
			// executes but does not stop
			key += 1;
		case 1:
			break;
		case 2:
			// executes and stops
			return "Modeule true";
		// used for any unmatched values
		default:
			// stops
			return key + "";
		}

		// NOTE: even if default case returns value,
		// there should still be a return statement
		// at the end of the method outside the switch case
		return null;
	}
}
