package Ex1301;

import java.time.LocalDate;

public class MyDateTest
{
	public static void main(String[] args)
	{
		MyDate date1 = new MyDate(23, 2, 1990);
		System.out.println(bornDaysAgo(date1));

		MyDate date2 = new MyDate(date1);

		System.out.println(date1.equals(date2));

		Person Andrei = new Person("Andrei Mungiu", "Borgergade 5", date1);
		Person Andrei2 = new Person("Andrei Mungiu", "Borgergade 5", date1);
		Person Andrei3 = Andrei2;

		System.out.println(Andrei.equals(Andrei2));
		System.out.println(Andrei2.equals(Andrei3));
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
