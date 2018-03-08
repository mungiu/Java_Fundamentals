package Ex1303;

public class Garage
{
	private Car[] parkingsArr = new Car[2];

	public Garage()
	{
		// setting all parkings to non occupied
		for (int i = 0; i < parkingsArr.length; i++)
			parkingsArr[i] = null;
	}

	public boolean isParkingAreaTaken(int i)
	{
		if (parkingsArr[i] != null)
			return true;
		else
			return false;
	}

	public void park(Car car, int position)
	{
		if (parkingsArr[position - 1] != null)
			System.out.printf("Parking space occupied by: %s, try somewhere else\n", parkingsArr[position]);
		else
			parkingsArr[position - 1] = car;
	}

	public Car leaveGarage(int position)
	{
		if (parkingsArr[position - 1] == null)
		{
			System.out.println("There is no car in here, null is returned");
			// NOTE: this returns null
			return parkingsArr[position - 1];
		} else
			return parkingsArr[position - 1];
	}

	@Override
	/** Adds all parked cars to a string */
	public String toString()
	{
		String _string = null;
		for (int i = 0; i < parkingsArr.length; i++)
			_string += parkingsArr[i] + "\n";

		return _string;
	}

	@Override
	public boolean equals(Object garage)
	{
		// checking if both are same types
		if (!(garage instanceof Garage))
			return false;
		else
		{
			Garage _garage = (Garage) garage;

			// starting to check each location inside both garages
			for (int i = 0; i < parkingsArr.length; i++)
			{
				if (parkingsArr[i] == null && _garage.parkingsArr[i] == null)
					continue;
				else if (parkingsArr[i].equals(_garage.parkingsArr[i]))
					continue;
				else
					// if both garage spaces are neither both null nor both equal
					return false;
			}
			// if the entire loop passed while all garage spaces where equal
			return true;
		}
	}
}
