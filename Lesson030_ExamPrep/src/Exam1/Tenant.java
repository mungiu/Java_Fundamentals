package Exam1;

public class Tenant
{
	private MyDate rentedFrom;
	private String name;

	public Tenant(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public MyDate getRentedFrom()
	{
		return rentedFrom;
	}

	public void setRentedFrom(MyDate date)
	{
		this.rentedFrom = date;
	}
}
