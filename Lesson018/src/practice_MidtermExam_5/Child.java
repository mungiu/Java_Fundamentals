package practice_MidtermExam_5;

public class Child
{
	private String name;
	private int age;

	public Child(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Child))
			return false;
		else
		{
			Child temp = (Child) obj;
			return (name == temp.name && age == temp.age);
		}
	}
}
