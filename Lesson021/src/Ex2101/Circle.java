package Ex2101;

public class Circle extends TwoDimensionalShape
{
	private double radius;

	public Circle(double x, double y, double radius)
	{
		super(x, y);
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getArea()
	{
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	public String toString()
	{
		return super.toString() + " radius: " + radius + " area: " + getArea();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Circle))
			return false;
		else
		{
			Circle temp = (Circle) obj;
			return super.equals(temp) && temp.radius == radius;
		}
	}
}
