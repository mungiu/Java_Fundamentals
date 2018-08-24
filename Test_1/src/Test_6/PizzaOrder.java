package Test_6;

import java.util.ArrayList;

public class PizzaOrder
{
	private Customer customer;
	private ArrayList<Pizza> pizzaList;

	public PizzaOrder(Customer customer)
	{
		this.customer = customer;
		pizzaList = new ArrayList<Pizza>();
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public int getNumberOfPizzas()
	{
		return pizzaList.size();
	}

	public void addPizza(Pizza pizaa)
	{
		pizzaList.add(pizaa);
	}

	public Pizza getPizaa(int index)
	{
		return pizzaList.get(index);
	}

	public Pizza getPizza(String pizzaName)
	{
		for (int i = 0; i < pizzaList.size(); i++)
			if (pizzaList.get(i).getName().equals(pizzaName))
				return pizzaList.get(i);

		return null;
	}
}
