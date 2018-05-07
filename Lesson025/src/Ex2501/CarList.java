package Ex2501;

import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
	private ArrayList<Car> cars = new ArrayList<Car>();

	public int size()
	{
		return cars.size();
	}

	public int indexOfRegNumber(String carRegNumber)
	{
		int index = -1;
		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getRegNumber().equals(carRegNumber))
				index = i;

		return index;
	}

	public Car getCar(int index)
	{
		return cars.get(index);
	}

	public Car getCar(String carRegNumber)
	{
		Car temp = null;

		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getRegNumber().equals(carRegNumber))
				temp = cars.get(i);

		return temp;
	}

	public void addCar(Car car)
	{
		if (!(cars.contains(car)))
			cars.add(car);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cars.size(); i++)
		{
			sb.append(cars.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();
	}
}
