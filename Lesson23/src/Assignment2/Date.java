package Assignment2;

//TODO class not finalized (implement copy() )
public class Date
{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void set(int day, int month, int year)
	{
		this.day = day;
		this.year = year;
		this.month = month;
	}

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

	public Date copy()
	{
		return new Date(day, month, year);
	}

	public String toString()
	{
		return "day: " + day + " month: " + month + " year: " + year;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Date))
			return false;
		else
		{
			Date temp = (Date) obj;

			return (temp.day == day && temp.month == month && temp.year == year);
		}
	}
}
