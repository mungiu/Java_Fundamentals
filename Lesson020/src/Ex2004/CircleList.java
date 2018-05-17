package Ex2004;

import java.util.ArrayList;

public class CircleList
{
	private ArrayList<Circle> circles;
	public int getNumberOfCircles()
	{
		return circles.size();
	}

	public CircleList(int capacity)
	{
		circles = new ArrayList<Circle>(capacity);
	}

	public void addCircle(Circle circle)
	{
		circles.add(circle);
	}

	public Circle getCircle(int index)
	{
		if (index <= circles.size())
			return circles.get(index);
		else
		{
			System.out.println("Invelid index for getCircle()");
			return null;
		}
	}

	public double getTotalArea()
	{
		double totalArea = 0;
		for (int i = 0; i < circles.size(); i++)
			totalArea += circles.get(i).getArea();

		return totalArea;
	}

	public double getAverageArea()
	{
		return getTotalArea() / circles.size();
	}
}
