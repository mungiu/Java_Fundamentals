package Ex1303;

public class Car
{
	public Car(String make, String model, String color, String licenseNumber, int year)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.year = year;
	}

	public Car(String make, String model, String color, int year)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = "No License Number";
		this.year = year;
	}

	String make;
	String model;
	String color;
	String licenseNumber;
	int year;

	public Car copy()
	{
		return new Car(color, licenseNumber, make, model, year);
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getLicenseNumber()
	{
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber)
	{
		this.licenseNumber = licenseNumber;
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

	@Override
	public String toString()
	{
		return "	Car [make=" + make + ", model=" + model + ", color=" + color + ", licenseNumber=" + licenseNumber
				+ ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object car)
	{
		if (!(car instanceof Car))
			return false;
		else
		{
			Car _car = (Car) car;
			return (this.color == _car.color && this.licenseNumber == _car.licenseNumber && this.make == _car.make
					&& this.model == _car.model && this.year == _car.year);
		}
	}
}
