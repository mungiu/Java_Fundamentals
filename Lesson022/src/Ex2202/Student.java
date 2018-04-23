package Ex2202;

public class Student
{
	private String name;
	private int grade;

	public Student(String name, int grade)
	{
		this.name = name;

		if (grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12)
			this.grade = grade;
		else
			throw new IllegalGradeException(grade); 
	}

	public String getName()
	{
		return name;
	}

	public int getGrade()
	{
		return grade;
	}

	public void setGrade(int grade)
	{
		if (grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12)
			this.grade = grade;
		else
			throw new IllegalGradeException(grade);
	}

	public String toString()
	{
		return "name: " + name + " grade: " + grade;
	}
}
