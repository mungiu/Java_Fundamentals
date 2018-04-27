package Assignment2;

public class HourlyEmployee extends Employee
{
	private double wagePerHour = 0;
	private double hoursWorkedPerWeek = 0;

	public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek)
	{
		super(name, birthday);
		this.wagePerHour = wagePerHour;
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	public void setWagePerHour(double wagePerHour)
	{
		this.wagePerHour = wagePerHour;
	}

	public double getWagePerHour()
	{
		return wagePerHour;
	}

	public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
	{
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	public double getHoursWorkedPerWeek()
	{
		return hoursWorkedPerWeek;
	}

	@Override
	public double earningsPerWeek()
	{
		return hoursWorkedPerWeek * wagePerHour;
	}

	@Override
	public String toString()
	{
		return super.toString() + " wage per hour: " + wagePerHour + " hours worked per week: " + hoursWorkedPerWeek;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof HourlyEmployee))
			return false;
		else
		{
			HourlyEmployee temp = (HourlyEmployee) obj;
			return (super.equals(temp) && temp.wagePerHour == wagePerHour
					&& temp.hoursWorkedPerWeek == hoursWorkedPerWeek);
		}
	}
}
