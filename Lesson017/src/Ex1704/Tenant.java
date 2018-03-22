package Ex1704;

public class Tenant
{
	private String name;
	private String phone;
	private double rentDue;

	public Tenant(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
		rentDue = 0;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public void setRentDue(double rentDue)
	{
		this.rentDue = rentDue;
	}

	public String getName()
	{
		return this.name;
	}

	public String getPhone()
	{
		return this.phone;
	}

	public double getRentDue()
	{
		return this.rentDue;
	}

	public Tenant copy()
	{
		return new Tenant(this.name, this.phone);
	}

	@Override
	public String toString()
	{
		return "Name: " + this.name + " Phone: " + this.phone + " Rent due: " + this.rentDue;
	}
}
