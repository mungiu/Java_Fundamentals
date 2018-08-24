package Test_4;

public class Van extends Car
{
	private int capacity;

	public Van(String licenseNo, double price, int capacity)
	{
		super(licenseNo, price);
		this.capacity = capacity;
	}

	@Override
	public String getType()
	{
		return "Van";
	}

	public int getCapacity()
	{
		return capacity;
	}
}
