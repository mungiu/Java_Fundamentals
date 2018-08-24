package Test_6;

import java.util.ArrayList;

public class Pizza
{
	private String name;
	private double initialPrice;
	private int numberOfToppings;
	private static int MAX_NUMBER_OF_TOPPINGS = 5;
	private ArrayList<Topping> toppingList;

	public Pizza(String name, double initialPrice)
	{
		this.name = name;
		this.initialPrice = initialPrice;
		toppingList = new ArrayList<Topping>();
	}

	public String getName()
	{
		return name;
	}

	public int getNumberOfToppings()
	{
		return numberOfToppings;
	}

	public void addTopping(Topping topping)
	{
		toppingList.add(topping);
	}

	public void removeTopping(String toppingName)
	{
		for (int i = 0; i < toppingList.size(); i++)
			if (toppingList.get(i).getName().equals(toppingName))
				toppingList.remove(i);
	}

	public double getTotalPrice()
	{
		int total = 0;

		for (int i = 0; i < toppingList.size(); i++)
			total += toppingList.get(i).getPrice();

		return total;
	}
}
