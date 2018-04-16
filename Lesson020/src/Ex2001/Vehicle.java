package Ex2001;

public class Vehicle
{
	private String owner;
	private double price;

	public Vehicle(String owner, double price)
	{
		this.owner = owner;
		this.price = price;
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String toString()
	{
		return owner + " " + price;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Vehicle))
			return false;
		else
		{
			Vehicle temp = (Vehicle) obj;
			return temp.owner == owner && temp.price == price;
		}
	}
}
