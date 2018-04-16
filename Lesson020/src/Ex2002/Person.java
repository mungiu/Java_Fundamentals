package Ex2002;

public class Person
{
	private String name;
	private int yearsOld;

	public Person(String name, int yearOld)
	{
		this.name = name;
		this.yearsOld = yearOld;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYearsOld()
	{
		return yearsOld;
	}

	public void setYearsOld(int yearsOld)
	{
		this.yearsOld = yearsOld;
	}

	public String toString()
	{
		return name + " " + yearsOld;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Person))
			return false;
		else
		{
			Person temp = (Person) obj;
			return name == temp.name && yearsOld == temp.yearsOld;
		}
	}
}
