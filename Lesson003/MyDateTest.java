
public class MyDateTest
{
	public static void main(String[] args)
	{
		MyDate test1 = new MyDate();
		MyDate test2 = new MyDate();

		test1.setDay(28);
		test1.setMonth(07);
		test1.setYear(1992);

		test2.setDay(19);
		test2.setMonth(04);
		test2.setYear(1996);

		System.out.println(test1.displayDate() + "\n" + test2.displayDate());

	}
}
