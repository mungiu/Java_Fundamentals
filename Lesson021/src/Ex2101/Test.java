package Ex2101;

public class Test
{
	public static void main(String[] args)
	{
		TwoDimensionalShape[] td1 = new TwoDimensionalShape[2];
		td1[0] = new Circle(10, 10, 20);
		td1[1] = new Rectangle(5, 5, 10, 10);

		for (int i = 0; i < td1.length; i++)
			System.out.println(td1[i]);
	}
}
