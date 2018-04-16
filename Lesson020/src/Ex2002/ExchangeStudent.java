package Ex2002;

public class ExchangeStudent extends Student
{
	private String comingFrom;

	public ExchangeStudent(String name, int yearsOld, String university, String comingFrom)
	{
		super(name, yearsOld, university);
		this.comingFrom = comingFrom;
	}

	public String comingFrom()
	{
		return comingFrom;
	}

	public void setComingFrom(String comingFrom)
	{
		this.comingFrom = comingFrom;
	}

	public String toString()
	{
		return super.toString() + " " + comingFrom;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof ExchangeStudent))
			return false;
		else
		{
			ExchangeStudent temp = (ExchangeStudent) obj;
			return super.equals(temp) && comingFrom.equals(temp.comingFrom);
		}
	}
}
