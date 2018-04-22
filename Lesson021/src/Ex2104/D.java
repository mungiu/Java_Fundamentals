package Ex2104;

public class D extends B
{
	public double q;
	protected double r;

	public void setQ(double q)
	{
		this.q = q;
	}

	public void setR(double r)
	{
		this.r = r;
	}

	public double getQ()
	{
		return q;
	}

	public double getR()
	{
		return r;
	}

	@Override
	public double calc()
	{
		return q * r;
	}
}
