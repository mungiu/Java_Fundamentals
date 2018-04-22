package Ex2104;

public abstract class B
{
	// accessible inside the class
	private int m;
	// accessible inside the class, package and subclasses
	protected int n;

	public void setM(int m)
	{
		this.m = m;
	}

	public void setN(int n)
	{
		this.n = n;
	}

	public int getM()
	{
		return m;
	}

	public int getN()
	{
		return n;
	}

	public abstract double calc();
}
