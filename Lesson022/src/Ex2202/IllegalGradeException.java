package Ex2202;

public class IllegalGradeException extends RuntimeException
{
	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 1L;

	public IllegalGradeException()
	{
		super("Invalid grade");
	}

	public IllegalGradeException(String msg)
	{
		this();
		System.out.print(msg);
	}
}
