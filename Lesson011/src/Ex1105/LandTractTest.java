package Ex1105;

public class LandTractTest
{
	public static void main(String[] args)
	{
		LandTract land1 = new LandTract(10, 10);
		LandTract land2 = new LandTract(10, 10);

		System.out.println(land1);
		System.out.println(land2);
		System.out.println(land1.equals(land2));
	}
}
