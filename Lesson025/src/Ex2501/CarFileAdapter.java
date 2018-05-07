package Ex2501;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
		// Car[] tempCarArr = new Car[carList.size()];

		// for (int i = 0; i < tempCarArr.length; i++)
		// tempCarArr[i] = carList.getCar(i);

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

	public void deleteCar(Car car)
	{
		MyFileIO fileIO = new MyFileIO();
		CarList tempCarList = null;
		CarList newCarList = new CarList();

		try
		{
			tempCarList = (CarList) fileIO.readObjectFromFile(fileName);
		} catch (FileNotFoundException fnf)
		{
			System.out.println("File not found error");
			fnf.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Class not found error");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException error occured");
			e.printStackTrace();
			System.exit(1);
		}

		for (int i = 0; i < tempCarList.size(); i++)
			if (!tempCarList.getCar(i).equals(car))
				newCarList.addCar(tempCarList.getCar(i));

		try
		{
			fileIO.writeToFile(fileName, newCarList);
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found error");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException error occured");
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void deleteCarByRegNumber(String carRegNumber)
	{
		MyFileIO fileIO = new MyFileIO();
		CarList tempCarList = null;
		CarList newCarList = new CarList();

		try
		{
			tempCarList = (CarList) fileIO.readObjectFromFile(fileName);
		} catch (FileNotFoundException fnf)
		{
			System.out.println("File not found error");
			fnf.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException e)
		{
			System.out.println("Class not found error");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException error occured");
			e.printStackTrace();
			System.exit(1);
		}

		for (int i = 0; i < tempCarList.size(); i++)
			if (!tempCarList.getCar(i).getRegNumber().equals(carRegNumber))
				newCarList.addCar(tempCarList.getCar(i));

		try
		{
			fileIO.writeToFile(fileName, newCarList);
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found error");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			System.out.println("IOException error occured");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
