package Ex1401;

import java.time.LocalDate;

public class MyDateTest
{
    public static void main(String[] args)
    {
	MyDate date1 = new MyDate(23, 2, 1990);
	MyDate date2 = new MyDate(date1);
	System.out.println(bornDaysAgo(date1));
	System.out.println(date1.equals(date2));
	System.out.println();

	Address address1 = new Address("Borgergade", "5", "8700", "Horsens", "Denmark");
	Address address2 = new Address("Borgergade", "5", "8700", "Horsens", "Denmark");

	Person Andrei = new Person("Andrei Mungiu", address1, date1);
	Person Andrei2 = new Person("Andrei Mungiu", address2, date1);
	Person Andrei3 = Andrei2;

	System.out.println(Andrei.equals(Andrei2));
	System.out.println(Andrei2.equals(Andrei3));
	System.out.println();

	Andrei.rememberThis("qwerty");
	Andrei2.rememberThis("qwertyu");
	System.out.println(Andrei.whatAreYouThinkingAbout());
	System.out.println(Andrei.doYouRemember("qwerty"));
	System.out.println(Andrei.equals(Andrei2));
	System.out.println(Andrei.getIq());
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
