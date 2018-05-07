package Ex2501;

import java.io.Serializable;

public class Car implements Serializable
{
	private static final long serialVersionUID = 965569400750494777L;
	
	private String regNumber, make, model;
	private int year;
	private Owner owner;

	public Car(String regNumber, String make, String model, int year, Owner owner)
	{
		this.regNumber = regNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.owner = owner;
	}

	public String getRegNumber()
	{
		return regNumber;
	}

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public int getYear()
	{
		return year;
	}

	public Owner getOwner()
	{
		return owner;
	}

	@Override
	public String toString()
	{
		return regNumber + "," + make + "," + model + "," + year + "," + owner;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Car))
			return false;
		else
		{
			Car temp = (Car) obj;
			return temp.make == make && temp.model == model && temp.owner == owner && temp.regNumber == regNumber
					&& temp.year == year;
		}
	}
}
