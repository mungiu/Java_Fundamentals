package Ex2204;

public class Main
{
	public static void main(String[] args)
	{
		double[] da = new double[10];

		for (int i = 0; i < da.length; i++)
			da[i] = 101;

		try
		{
			TestScores ts = new TestScores(da);
		} catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
