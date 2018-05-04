package Ex2501;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class CarFileAdapter
{
	private String fileName;

	public CarFileAdapter(String fileName)
	{
		this.fileName = fileName;
	}

	public CarList getAllCars(String fileName)
	{
		// binary file reader
		MyFileIO fileIO = new MyFileIO();
		CarList carList = new CarList();

		try
		{
			carList = (CarList) fileIO.readObjectFromFile(fileName);
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found exception");
			e.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Class not foudn exception");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(1);
		}

		return carList;
	}

	public void addCar(Car car)
	{
		MyFileIO fileIO = new MyFileIO();

		try
		{
			fileIO.writeToFile(fileName, car);
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found exception");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void addCars(CarList carList)
	{
		MyFileIO fileIO = new MyFileIO();

		try
		{
			fileIO.writeToFile(fileName, carList);
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found exception");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(1);
		}
	}

	// TODO : FINALIZE
	public void deleteCar(Car car)
	{
		MyFileIO fileIO = new MyFileIO();
		CarList carList = null;

		try
		{
			carList = (CarList) fileIO.readObjectFromFile(fileName);
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found exception");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Class not found exception");
			e.printStackTrace();
			System.exit(1);
		}

		for (int i = 0; i < carList.size(); i++)
			if (carList.getCar(i) == car)
				carList.getCar(i))
	}
}
