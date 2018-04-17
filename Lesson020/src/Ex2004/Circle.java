package Ex2004;

public class Circle
{
	private double radius;
	private Point center;

	public Circle(double x, double y, double radius)
	{
		center = new Point(x, y);
		this.radius = radius;
	}

	public Point getCenter()
	{
		return center.copy();
	}

	public double getRadius()
	{
		return radius;
	}

	public void moveCirle(double dx, double dy)
	{
		center.move(dx, dy);
	}

	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	public String toString()
	{
		return "canter: " + center + " radius: " + radius;
	}

	public boolean Equals(Object obj)
	{
		if (!(obj instanceof Circle))
			return false;
		else
		{
			Circle temp = (Circle) obj;
			return center == temp.center && radius == temp.radius;
		}
	}
}
