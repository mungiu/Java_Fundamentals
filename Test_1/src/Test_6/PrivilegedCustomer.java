package Test_6;

public class PrivilegedCustomer extends Customer
{
	private double discount;

	public PrivilegedCustomer(String name)
	{
		super(name);
	}

	public double getDiscount()
	{
		return discount;
	}

	public void setDiscount(double percentage)
	{
		discount = percentage;
	}
}
