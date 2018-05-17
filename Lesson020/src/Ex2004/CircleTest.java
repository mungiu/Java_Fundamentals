package Ex2004;

public class CircleTest
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(1, 1, 10);

		c1.getCenter().move(0, 150);

		Circle c2 = new Circle(c1.getCenter().getX(), c1.getCenter().getY(), 10);

		CircleList cl1 = new CircleList(3);

		cl1.addCircle(c1);
		cl1.addCircle(c2);

		System.out.println(cl1.getTotalArea());
		System.out.println(cl1.getAverageArea());

		for (int i = 0; i < cl1.getNumberOfCircles(); i++)
			System.out.println(cl1.getCircle(i));
	}
}
