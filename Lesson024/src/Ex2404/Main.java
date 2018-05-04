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
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Student> studentArrList = new ArrayList<Student>();
		Student st1 = new Student("Andrei Mungiu", "Vasilevici", "Moldova");
		studentArrList.add(st1);

		MyFileIO objectFileReader = new MyFileIO();

		try
		{
			System.out.println("Please input name of new file with .bin as file extension");
			objectFileReader.writeToFile(keyboard.nextLine(), studentArrList);

			System.out.println("File saved, please input .bin file to be read and displayed");
			String[] tempArr = (String[]) objectFileReader.readArrFromFile(keyboard.nextLine());
			
			for (int i = 0; i < tempArr.length; i++)
				System.out.println(tempArr[i].toString());
			
		} catch (FileNotFoundException fnf)
		{
			System.out.println("File not found or could not be open error");
			fnf.printStackTrace();
			System.exit(1);
		} catch (IOException io)
		{
			System.out.println("Failed to write to file error");
			io.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException cnf)
		{
			System.out.println("Class not found error");
			cnf.printStackTrace();
			System.exit(1);
		}
	}
}
