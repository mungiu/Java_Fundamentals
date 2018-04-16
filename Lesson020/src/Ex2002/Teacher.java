package Ex2002;

public class Teacher extends Employee
{
	private String lectureSubject;
	private String[] courses;

	public Teacher(String name, int yearsOld, int salary, String lectureSubject)
	{
		super(name, yearsOld, salary);
		this.lectureSubject = lectureSubject;
	}

	public String[] getCoursesArr()
	{
		return courses;
	}

	public String getLectureSubject()
	{
		return lectureSubject;
	}

	public void setLectureSubject(String lectureSubject)
	{
		this.lectureSubject = lectureSubject;
	}

	public String toString()
	{
		return super.toString() + " " + lectureSubject;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Teacher))
			return false;
		else
		{
			Teacher temp = (Teacher) obj;
			return super.equals(temp) && lectureSubject.equals(temp.lectureSubject);
		}
	}
}
