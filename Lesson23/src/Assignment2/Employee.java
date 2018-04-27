package Assignment2;

public abstract class Employee
{
	private String name;
	private Date date;

	public Employee(String name, Date birthday)
	{
		this.name = name;
		date = new Date(birthday.getDay(), birthday.getMonth(), birthday.getYear());
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double earningsPerWeek()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
