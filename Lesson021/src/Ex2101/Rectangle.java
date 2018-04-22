package Ex2101;

public class Rectangle extends TwoDimensionalShape
{
	private double width;
	private double length;

	public Rectangle(double x, double y, double width, double length)
	{
		super(x, y);
		this.width = width;
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	@Override
	public double getArea()
	{
		return width * length;
	}

	@Override
	public String toString()
	{
		return super.toString() + " width: " + width + " length: " + length + " area: " + getArea();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Rectangle))
			return false;
		else
		{
			Rectangle temp = (Rectangle) obj;
			return super.equals(temp) && width == temp.width && length == temp.length;
		}
	}
}
