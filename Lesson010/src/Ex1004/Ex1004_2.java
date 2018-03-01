package Ex1004;

public class Ex1004_2
{
	public static void main(String[] args)
	{
		String square = "#";
		String space = " ";

		for (int i = 0; i < 6; i++)
		{
			System.out.print(square);

			for (int j = i; j > 0; j--)
				System.out.print(space);

			System.out.println(square);
		}
	}
}
