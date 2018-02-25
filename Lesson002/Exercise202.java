import java.util.Scanner;

public class Exercise202
{
	public static void main(String[] args)
	{
		int no1;
		int no2;
		int no3;

		Scanner s = new Scanner(System.in);

		System.out.println("Please enter 3 integers that you want to sum up");
		no1 = s.nextInt();
		no2 = s.nextInt();
		no3 = s.nextInt();
		s.close();

		System.out.println("The sum of those numbers = " + (no1 + no2 + no3));
	}
}
