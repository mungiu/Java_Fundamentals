package Assignment2;

public class SalariedEmployee extends Employee
{
	public double weeklySalary = 0;

	public SalariedEmployee(String name, Date birthday, double weeklySalary)
	{
		super(name, birthday);
		this.weeklySalary = weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary()
	{
		return weeklySalary;
	}

	@Override
	public double earningsPerWeek()
	{
		return weeklySalary;
	}

	@Override
	public String toString()
	{
		return super.toString() + " weekly salary: " + weeklySalary;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof SalariedEmployee))
			return false;
		else
		{
			SalariedEmployee temp = (SalariedEmployee) obj;

			return (super.equals(temp) && temp.weeklySalary == weeklySalary);
		}
	}

}
