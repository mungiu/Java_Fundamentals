package Ex902;

import java.time.LocalDate;

public class MyDateTest
{
	public static void main(String[] args)
	{
		/*
		 * Scanner key = new Scanner(System.in);
		 * System.out.println("Check leap year count between two different years.\n" +
		 * "Please input them and press enter after each: ");
		 * 
		 * int leapYearsCount = MyDate.leapYearsTill(key.nextInt(), key.nextInt());
		 * key.close();
		 * 
		 * System.out.println(leapYearsCount); //
		 * =============================================================================
		 * ===========
		 */
		MyDate andrei = new MyDate(23, 2, 1990);
		System.out.println(bornDaysAgo(andrei));

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
