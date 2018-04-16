package Ex2002;

public class Employee extends Person
{
	private int salary;

	public Employee(String name, int yearsOld, int salary)
	{
		super(name, yearsOld);
		this.salary = salary;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String toString()
	{
		return super.toString() + " " + salary;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Employee))
			return false;
		else
		{
			Employee temp = (Employee) obj;
			return super.equals(temp) && salary == temp.salary;
		}
	}
}
