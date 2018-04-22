package Ex2101;

public abstract class TwoDimensionalShape
{
	private double x;
	private double y;

	public TwoDimensionalShape(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public void moveTo(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public abstract double getArea();

	public String toString()
	{
		return "x: " + x + " y: " + y;
	}
}
