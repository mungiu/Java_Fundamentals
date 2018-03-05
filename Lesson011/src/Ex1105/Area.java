package Ex1105;

public class Area
{
	public static double area(double circleRadius)
	{
		return Math.PI * Math.pow(circleRadius, 2);
	};

	public static double area(int rectangleWidth, int rectangleLength)
	{
		return rectangleWidth * rectangleLength;
	};

	public static double area(double radius, double height)
	{
		return Math.PI * Math.pow(radius, 2) * height;
	};
}
