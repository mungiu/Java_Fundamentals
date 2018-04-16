package Ex2002;

public class ITSupporter extends Employee
{
	private String department;

	public ITSupporter(String name, int yearsOld, int salary, String department)
	{
		super(name, yearsOld, salary);
		this.department = department;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String toString()
	{
		return super.toString() + " " + department;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof ITSupporter))
			return false;
		else
		{
			ITSupporter temp = (ITSupporter) obj;
			return super.equals(temp) && department.equals(temp.department);
		}
	}
}
