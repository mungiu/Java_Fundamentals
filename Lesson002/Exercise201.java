import java.util.Scanner;

public class Exercise201
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your favorite city: ");
		String favCity = s.nextLine();
		s.close();

		System.out.println("The number of letters in your city's name is = " + favCity.length()
				+ "\nCity name in uppercase = " + favCity.toUpperCase() + "\nCity name in lowercase = "
				+ favCity.toLowerCase() + "\nThe first initial of the city name is = " + favCity.charAt(0));
	}
}
