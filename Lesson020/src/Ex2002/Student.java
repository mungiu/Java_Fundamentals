package Ex2002;

public class Student extends Person
{
	private String university;

	public Student(String name, int yearsOld, String university)
	{
		super(name, yearsOld);
		this.university = university;
	}

	public String getUniversity()
	{
		return university;
	}

	public void setUniversity(String university)
	{
		this.university = university;
	}

	public String toString()
	{
		return super.toString() + " " + university;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Student))
			return false;
		else
		{
			Student temp = (Student) obj;
			return super.equals(temp) && university == temp.university;
		}
	}
}
