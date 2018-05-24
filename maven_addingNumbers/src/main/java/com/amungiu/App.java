package com.amungiu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int nr1 = 0;
		int nr2 = 0;
		int result;

		System.out.println("Please input 2 integers separated by enter key to be added: ");

		nr1 = keyboard.nextInt();
		nr2 = keyboard.nextInt();
		result = nr1 + nr2;

		System.out.println("The addition result is: " + result);
	}
}
