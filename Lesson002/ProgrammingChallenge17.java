import java.util.Scanner;

public class ProgrammingChallenge17
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the following information about yourself:\n" + "Your name: ");
		String name = s.nextLine();
		System.out.print("Your age: ");
		int age = s.nextInt();
		s.nextLine();
		System.out.print("City name: ");
		String city = s.nextLine();
		System.out.print("College name: ");
		String college = s.nextLine();
		System.out.print("Profession: ");
		String prof = s.nextLine();
		System.out.print("Pet animal: ");
		String pettype = s.nextLine();
		System.out.print("Pet name: ");
		String petname = s.nextLine();
		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age
				+ ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a "
				+ prof + ".\nThen, " + name + " adopted a(n) " + pettype + " named " + petname
				+ ". They both lived happily ever after!");
		s.close();

	}
}
