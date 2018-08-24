package Test_3;

public class Student
{
	private Education education;
	private String name;

	public Student(String name, Education education)
	{
		this.education = education;
		this.name = name;
	}

	public Education getEducation()
	{
		return education;
	}

	public String getName()
	{
		return name;
	}

	public void changeEducation(Education education)
	{
		this.education = education;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Student))
			return false;
		else
		{
			Student temp = (Student) obj;
			return temp.getName().equals(name);
		}
	}

	public String toString()
	{
		return "name: " + name + " education: " + education;
	}
}
