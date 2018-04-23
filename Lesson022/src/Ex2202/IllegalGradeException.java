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

	public IllegalGradeException(int grade)
	{
		super("Invalid grade: " + grade);
	}
}
