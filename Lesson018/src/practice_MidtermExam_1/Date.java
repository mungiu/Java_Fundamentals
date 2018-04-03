package practice_MidtermExam_1;

public class Date
{
	private int day, month, year;

	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date()
	{
	}

	public void set(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date copy()
	{
		return new Date(this.day, this.month, this.year);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Date))
			return false;
		else
		{
			Date _temp = (Date) obj;

			return _temp.day == day && _temp.month == month && _temp.year == year;
		}
	}

	@Override
	public String toString()
	{
		return "day " + day + " month " + month + " year " + year;
	}
}
