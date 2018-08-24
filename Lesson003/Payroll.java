
public class Payroll
{

	String name;
	double payrate;
	double workHours;

	public Payroll()
	{}

	public Payroll(String name, double payrate, double workHours)
	{
		this.name = name;
		this.payrate = payrate;
		this.workHours = workHours;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPayrate(double payrate)
	{
		this.payrate = payrate;
	}

	public void setWorkHours(double workHours)
	{
		this.workHours = workHours;
	}

	public String getName()
	{
		return name;
	}

	public double getPayrate()
	{
		return payrate;
	}

	public double getWorkHours()
	{
		return payrate;
	}

	public double grossPay()
	{
		return workHours * payrate;
	}
}
