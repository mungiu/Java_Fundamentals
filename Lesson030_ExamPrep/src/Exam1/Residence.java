package Exam1;

import java.util.Date;

public abstract class Residence
{
	private Tenant rentedTo = null;
	private int number;
	private double size;
	private String type;

	public Residence(int number, double size, String type)
	{
		this.number = number;
		this.size = size;
		this.type = type;
	}

	public int getNumber()
	{
		return number;
	}

	public double getSize()
	{
		return size;
	}

	public String getType()
	{
		return type;
	}

	public boolean isAvailable()
	{
		if (rentedTo != null)
			return true;
		else
			return false;
	}

	public void rentTo(Tenant tenant, Date rentedFrom)
	{
		rentedTo = tenant;

		String tempStr = rentedFrom.toString();
		String[] day = tempStr.split(" ", 3);
		String[] month = tempStr.split(":", 2);
		String[] year = tempStr.split(" ", 6);

		rentedTo.setRentedFrom(
				new MyDate(Integer.parseInt(day[2]), Integer.parseInt(month[1]), Integer.parseInt(year[5])));
	}

	public Tenant getTenant()
	{
		return rentedTo;
	}

	public abstract int getNumberOfRooms();
}
