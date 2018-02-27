package Ex704;

import java.util.Scanner;

public class Ex704
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		Boolean passwordMatch = false;
		String password;
		String login;
		String passwordConfirm;

		System.out.println(
				"Please input a login, a password and a password confirmation. \n" + "NOTE: Press enter after each.");
		do
		{
			login = key.nextLine();
			password = key.nextLine();
			passwordConfirm = key.nextLine();

			passwordMatch = password.equals(passwordConfirm);

			if (passwordMatch)
			{
				key.close();
				// printing confirmation to user
				System.out.printf("Password confirmation matches!\n Your login is \"%s\"\n Your password is %s", login,
						password);
			} else
				System.out.println("Password did not match, please re-enter login, password and confirmation password");
		} while (!passwordMatch);
	}
}
