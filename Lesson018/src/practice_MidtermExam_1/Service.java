package practice_MidtermExam_1;

public class Service
{
	private int milage;
	private Date date;

	public Service(int mileage, Date date)
	{
		this.milage = mileage;
		this.date = date;
	}

	public int getMileage()
	{
		return milage;
	}

	public Date getDate()
	{
		return date;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Service))
			return false;
		else
		{
			Service _temp = (Service) obj;
			return (_temp.getMileage() == getMileage() && _temp.getDate() == getDate());
		}
	}

	@Override
	public String toString()
	{
		return "date " + date + " milage " + milage;
	}
}
