package Ex2203;

public class IllegalDateException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalDateException()
	{
		super("Invalid day, month or year");
	}

	public IllegalDateException(int dayOrMonthOrYear)
	{
		super("Invalid day, month or year: " + dayOrMonthOrYear);
	}
}
