package Ex2404;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Student> studentArrList = new ArrayList<Student>();
		Student st1 = new Student("Andrei Mungiu", "Vasilevici", "Moldova");
		Scanner keyboard = new Scanner(System.in);
		// use to write to binary file
		FileOutputStream fileOut = null;
		ObjectOutputStream write = null;
		// use to read from binary file
		FileInputStream fileIn = null;
		ObjectInputStream read = null;

		studentArrList.add(st1);

		try
		{
			System.out.println("Please input name of new file with .bin as file extension");
			fileOut = new FileOutputStream(keyboard.nextLine());
			// connecting the write function to the file
			write = new ObjectOutputStream(fileOut);

			write.writeObject(st1);
			write.close();

			System.out.println("File saved, please input .bin file to be read and displayed");
			fileIn = new FileInputStream(keyboard.nextLine());
			keyboard.close();
			// connecting the read function to the file
			read = new ObjectInputStream(fileIn);

			for (int i = 0; i < studentArrList.size(); i++)
				System.out.println(read.readObject());

			read.close();

		} catch (FileNotFoundException fnf)
		{
			System.out.println("File not found or could not be open error");
			System.exit(1);
		} catch (IOException io)
		{
			System.out.println("Failed to write to file error");
			System.exit(1);
		} catch (ClassNotFoundException cnf)
		{
			System.out.println("Class not found error");
			System.exit(1);
		}
	}
}
