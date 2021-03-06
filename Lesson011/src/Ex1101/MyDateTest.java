package Ex1101;

import java.time.LocalDate;

public class MyDateTest
{
	public static void main(String[] args)
	{
		MyDate date1 = new MyDate(23, 2, 1990);
		System.out.println(bornDaysAgo(date1));

		MyDate date2 = new MyDate(date1);
		
		System.out.println(date1.equals(date2));
	}

	/** Calculates how many days ago you where born */
	private static int bornDaysAgo(MyDate date)
	{
		int days = 0;
		LocalDate localDate = LocalDate.now();
		while (!(date.getYear() == localDate.getYear() && date.getMonth() == localDate.getMonthValue()
				&& date.getDay() == localDate.getDayOfMonth()))
		{
			date.nextDay();
			System.out.println(date);
			days++;
		}

		return days;
	}
}
