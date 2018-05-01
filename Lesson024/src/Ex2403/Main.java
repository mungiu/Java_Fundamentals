package Ex2403;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		// used to write to binary file
		FileOutputStream fileOut = null;
		ObjectOutputStream write = null;
		// used to read from binary file
		FileInputStream fileIn = null;
		ObjectInputStream read = null;
		int nrOfInts = 0;

		System.out.println("Please input number of integers you want randomly generated: ");
		nrOfInts = keyboard.nextInt();

		try
		{
			System.out.println("Please input file name followed by .bin extension");
			keyboard.nextLine();
			fileOut = new FileOutputStream(keyboard.nextLine());
			// linking the writer and the file
			write = new ObjectOutputStream(fileOut);

			// writing random integers as binary to file
			for (int i = 0; i < nrOfInts; i++)

				write.writeObject((int) (Math.random() * 100));

			// this closes and saves the writer
			write.close();
			System.out.println("File saved");

			System.out.println("Please input full binary file name to read:");
			fileIn = new FileInputStream(keyboard.nextLine());
			read = new ObjectInputStream(fileIn);

			for (int i = 0; i < nrOfInts; i++)
				System.out.println(read.readObject());

			keyboard.close();

			// closes the read stream
			read.close();

		} catch (FileNotFoundException e)
		{
			System.out.println("File not found or can't be open");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IO error writing to file");
			e.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Class not found");
			e.printStackTrace();
			System.exit(1);
		}

	}
}
