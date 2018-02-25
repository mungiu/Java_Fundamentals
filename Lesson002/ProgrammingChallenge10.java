import java.util.Scanner;

public class ProgrammingChallenge10
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int score1;
		int score2;
		int score3;

		System.out.print("Please enter grade number 1: ");
		score1 = s.nextInt();
		System.out.print("Enter grade number 2: ");
		score2 = s.nextInt();
		System.out.print("Enter grade number 3: ");
		score3 = s.nextInt();
		int avg = score1 + score2 + score3;
		s.close();

		System.out.println(
				"Your grades were: " + score1 + " " + score2 + " " + score3 + " the average of those 3 = " + avg);
	}

}
