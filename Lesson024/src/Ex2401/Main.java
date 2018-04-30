package Ex2401;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		PrintWriter write = null;
		Scanner keyboard = new Scanner(System.in);
		Scanner fileRead = null;
		FileInputStream fileIn = null;

		System.out.println("This program wil lcreate a file and store your friends names");

		try
		{
			System.out.println("Please input file name to store friends name followed by \".txt\" and \"enter\" key.");
			FileOutputStream fileOut = new FileOutputStream(keyboard.nextLine());
			write = new PrintWriter(fileOut);
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found, or could not be open");
			System.exit(1);
		}

		for (int i = 0; i < 3; i++)
		{
			System.out.println("Please input friend name, and press \"enter\", " + (3 - i) + " friends to go");
			write.println(keyboard.nextLine());
		}

		write.close();

		System.out.println("File saved, check inside project"
				+ "\nTry opening the file now by typing in its name + \".txt\" at the end and press enter");

		try
		{
			fileIn = new FileInputStream(keyboard.nextLine());
			// instantiating the scanner with the file as a parameter
			fileRead = new Scanner(fileIn);
			keyboard.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found, or could not be open");
			System.exit(1);
		}

		
		while (fileRead.hasNext())
		{
			System.out.println(fileRead.nextLine());
		}
		
		System.out.println("Finished outputing what the file contains.");
	}
	
	
}
