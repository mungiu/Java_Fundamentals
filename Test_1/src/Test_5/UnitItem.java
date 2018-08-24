package Test_5;

public class UnitItem extends Item
{
	public UnitItem(String name, double price)
	{
		super(name, price);
	}

	public String getInfo()
	{
		return "name " + super.getName() + " price " + super.getPrice();
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof UnitItem))
			return false;
		else
		{
			UnitItem temp = (UnitItem) obj;
			return temp.getInfo().equals(getInfo());
		}
	}
}
