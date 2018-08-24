package Test_5;

import java.util.ArrayList;

public class Order
{
	private int numberOfOrderedLines;
	private ArrayList<OrderLine> orderList;

	public Order(int maxNumberOfOrderes)
	{
		orderList = new ArrayList<OrderLine>(maxNumberOfOrderes);
	}

	public void addOrderLine(Item item, int amount)
	{
		orderList.add(new OrderLine(item, amount));
	}

	public int getNumberOfOrderedLines()
	{
		return numberOfOrderedLines;
	}

	public double getTotalPrice()
	{
		int total = 0;
		for (int i = 0; i < orderList.size(); i++)
			total += orderList.get(i).getItem().getPrice();

		return total;
	}

	public Item getOrderedItem(int orderedLineIndex)
	{
		return orderList.get(orderedLineIndex).getItem();
	}

	public int getAmountOfOrderedItem(int orderLineIndex)
	{
		return orderList.get(orderLineIndex).getAmount();
	}

	public double getTotalWeightForWeigtedItems()
	{
		double total = 0;
		for (int i = 0; i < orderList.size(); i++)
			total += ((WeightedItem) orderList.get(i).getItem()).getWeight();

		return total;
	}

	public String toString()
	{
		return "nr of ord lines: " + numberOfOrderedLines;
	}
}
