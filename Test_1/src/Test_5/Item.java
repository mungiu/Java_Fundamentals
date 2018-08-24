package Test_5;

public abstract class Item
{
	private String name;
	private double price;

	public Item(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Item))
			return false;
		else
		{
			Item temp = (Item) obj;
			return temp.getName().equals(getName()) && temp.getPrice() == getPrice();
		}
	}

	public String toString()
	{
		return "name: " + name + " price: " + price;
	}

	public abstract String getInfo();
}
