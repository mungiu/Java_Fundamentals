package Test_5;

public class WeightedItem extends Item
{
	private double weight;

	public WeightedItem(String name, double price, double weight)
	{
		super(name, price);
		this.weight = weight;

	}

	public String getInfo()
	{
		return "name: " + super.getName() + " price: " + super.getPrice() + " weight: " + getWeight();
	}

	public double getWeight()
	{
		return weight;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof WeightedItem))
			return false;
		else
		{
			WeightedItem temp = (WeightedItem) obj;
			return temp.getWeight() == getWeight() && temp.getName().equals(getName());
		}
	}

}
