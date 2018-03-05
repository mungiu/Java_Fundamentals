package Test_1;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		boolean palindrome = false;

		System.out.println("Please input text and press enter:");
		String text = keyboard.nextLine();
		keyboard.close();

		for (int i = 0; i < text.length() - 1; i++)
		{
			if (text.charAt(i) == text.charAt(text.length() - 1 - i))
				palindrome = true;
			else if (text.charAt(i) != text.charAt(text.length() - 1 - i))
			{
				palindrome = false;
				break;
			}
		}

		System.out.println("Is it a palindrome? " + palindrome);
	}
}
