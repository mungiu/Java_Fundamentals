package Test_4;

public class SportsCar extends Car
{
	SportsCar(String licenseNo, double price)
	{
		super(licenseNo, price);
	}

	@Override
	public String getType()
	{
		return "SportsCar";
	}
}
