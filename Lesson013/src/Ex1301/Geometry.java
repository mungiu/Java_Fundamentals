package Ex1301;

public class Geometry
{
	public static double circleArea(double radius)
	{
		try
		{
			return Math.PI * Math.pow(radius, 2);

		} catch (IllegalArgumentException e)
		{
			throw e;
		}
	}

	public static double rectangleArea(double length, double width)
	{
		try
		{
			return length * width;

		} catch (IllegalArgumentException e)
		{
			throw e;
		}
	}

	public static double triangleArea(double base, double height)
	{
		try
		{
			return base * height * 0.5;
		} catch (IllegalArgumentException e)
		{
			throw e;
		}
	}
}
