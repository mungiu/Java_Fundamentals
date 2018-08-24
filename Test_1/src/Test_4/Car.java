package Test_4;

public abstract class Car
{
	private String licenseNo;
	private double price;
	private Customer rentedTo = null;

	public Car(String licenseNo, double price)
	{
		this.licenseNo = licenseNo;
		this.price = price;
	}

	public abstract String getType();

	public boolean isAvailable()
	{
		if (rentedTo != null)
			return true;

		return false;
	}

	public Customer getRentedTo()
	{
		return rentedTo;
	}

	public void setRentedTo(Customer rentedTo)
	{
		this.rentedTo = rentedTo;
	}

	public String getLicenseNo()
	{
		return licenseNo;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}
