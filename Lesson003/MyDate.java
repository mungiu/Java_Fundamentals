
public class MyDate
{

	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate()
	{
		this.day = 1;
		this.month = 1;
		this.year = 1700;
	}

	public String displayDate()
	{
		String disP = "";

		disP += day + "/" + month + "/" + year;
		return disP;
	}

	public boolean isLeapYear()
	{
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int daysInMonth()
	{
		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (isLeapYear())
				return 29;
			else
				return 28;
		default:
			return 0;
		}
	}

	public String getAstroSign()
	{
		if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
			return "Aries";
		else if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
			return "Taurus";
		else if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
			return "Gemini";
		else if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
			return "Cancer";
		else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
			return "Leo";
		else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
			return "Virgo";
		else if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
			return "Libra";
		else if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
			return "Scorpio";
		else if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
			return "Saggittarius";
		else if ((month == 12 && day >= 22) || (month == 1 && day <= 19))
			return "Capricorn";
		else if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
			return "Aquarius";
		else if ((month == 2 && day >= 19) || (month == 3 && day <= 20))
			return "Pisces";
		else
			return "Error in input";
	}

	public String dayOfWeek()
	{
		int _day;

		if (month == 1 || month == 2)
		{
			month += 1;
			year -= 1;
		}

		_day = (((day + ((13 * (month + 1))) / 5)) + year % 100 + ((year % 100) / 4) + ((year / 100) / 4)
				+ (5 * (year / 100))) % 7;

		switch (_day)
		{
		case 0:
			return "Saturday";
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		default:
			return "Error in value";
		}
	}

	public String getMonthName()
	{
		switch (month)
		{
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		default:
			return "getMonthName error";
		}
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public void setYear(int year)
	{
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

	@Override
	public String toString()
	{
		return day + "/" + month + "/" + year;
	}
}
