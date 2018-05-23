package Exam1;

import java.util.GregorianCalendar;

public class MyDate
{
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
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

	public void set(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate copy()
	{
		return new MyDate(this.day, this.month, this.year);
	}

	public static MyDate now()
	{
		GregorianCalendar calendar = new GregorianCalendar();

		return new MyDate(calendar.get(GregorianCalendar.DATE), calendar.get(GregorianCalendar.MONTH),
				calendar.get(GregorianCalendar.YEAR));
	}
}
