package Ex2004;

public class Point
{
	private double x;
	private double y;

	public Point(double x, double y)
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

	public void move(double dx, double dy)
	{
		this.x += dx;
		this.y += dy;
	}

	public String toString()
	{
		return "(" + x + "," + y + ")";
	}

	public Point copy()
	{
		return new Point(this.x, this.y);
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Point))
			return false;
		else
		{
			Point temp = (Point) obj;
			return x == temp.x && y == temp.y;
		}
	}
}