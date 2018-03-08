package Ex1301;

import java.util.Scanner;

public class TestGeometry
{
	public static void main(String[] args)
	{
		regression();
	}

	public static void regression()
	{
		System.out.println("1 calculate circle \n2 calculate rectangle \n3 triangle \nq4 quit");
		Scanner key = new Scanner(System.in);

		switch (key.nextInt())
		{
		case 1:
			System.out.println("Input circle radius");
			double radius = key.nextDouble();
			System.out.println(Geometry.circleArea(radius));
			regression();
			break;
		case 2:
			System.out.println("Input length and width");
			double length = key.nextDouble();
			double width = key.nextDouble();
			System.out.println(Geometry.rectangleArea(length, width));
			regression();
			break;
		case 3:
			System.out.println("Input length and width");
			double base = key.nextDouble();
			double height = key.nextDouble();
			System.out.println(Geometry.triangleArea(base, height));
			regression();
			break;
		case 4:
			key.close();
			break;
		default:
			System.out.println("Input valid option");
			regression();
			break;
		}
	}
}
