package Ex2202;

public class Test
{
	public static void main(String[] args)
	{
		Student st1 = new Student("Andrei", 12);
		try
		{
			st1.setGrade(11);
		} catch (IllegalGradeException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println(st1.getGrade());
	}
}
