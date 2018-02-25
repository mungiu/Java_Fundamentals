package Ex701;

import java.util.Scanner;

public class Ex701
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Please input a number from 1 to 10");

		int number = key.nextInt();
		String romanNumber;

		key.close();

		if (number >= 1 && number <= 10)
		{
			switch (number)
			{
			case 1:
				romanNumber = "I";
				break;
			case 2:
				romanNumber = "II";
				break;
			case 3:
				romanNumber = "III";
				break;
			case 4:
				romanNumber = "IV";
				break;
			case 5:
				romanNumber = "V";
				break;
			case 6:
				romanNumber = "VI";
				break;
			case 7:
				romanNumber = "VII";
				break;
			case 8:
				romanNumber = "VIII";
				break;
			case 9:
				romanNumber = "IX";
				break;
			case 10:
				romanNumber = "X";
			default:
				romanNumber = "Something went wrong";
				break;
			}

			System.out.printf("The equivalent roman number is: %s", romanNumber);
		}
	}
}
