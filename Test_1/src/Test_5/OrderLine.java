package Test_5;

public class OrderLine
{
	private int amount;
	private Item item;

	public OrderLine(Item item, int amount)
	{
		this.item = item;
		this.amount = amount;
	}

	public int getAmount()
	{
		return amount;
	}

	public Item getItem()
	{
		return item;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof OrderLine))
			return false;
		else
		{
			OrderLine temp = (OrderLine) obj;
			return temp.getItem().equals(getItem()) && temp.getAmount() == getAmount();
		}
	}

	public String toString()
	{
		return "item: " + getItem().getName() + " amount: " + getAmount();
	}
}
