package Ex704;

import java.util.Scanner;

public class Ex704
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		Boolean run = true;

		while (run)
		{
			System.out.println("Please input a login, a password and a password confirmation. \n"
					+ "NOTE: Press enter after each.");
			String login = key.nextLine();
			String password = key.nextLine();
			String passwordConfirm = key.nextLine();

			Boolean passwordMatch = password.equals(passwordConfirm);

			if (passwordMatch)
			{
				key.close();
				// printing confirmation to user
				System.out.printf("Password confirmation matches! You login is \"%s\"", login);
				// ending loop
				run = false;
			}
			else
				System.out.println("Password did not match, please re-enter");
		}
	}
}
