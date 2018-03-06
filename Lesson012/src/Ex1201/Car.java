package Ex1201;

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

	public Car copy(Car car)
	{
		return new Car(car.color, car.licenseNumber, car.make, car.model, car.year);
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
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", licenseNumber=" + licenseNumber
				+ ", year=" + year + "]";
	}

	public boolean equals(Car car)
	{
		return (this.color == car.color && this.licenseNumber == car.licenseNumber && this.make == car.make
				&& this.model == car.model && this.year == car.year);
	}
}
