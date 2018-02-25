import java.util.Scanner;

public class Exercise204
{
	public static void main(String[] args)
	{
		String name;
		String address;
		int age;

		Scanner s = new Scanner(System.in);

		System.out.println("Please enter your name here: ");
		name = s.next();
		System.out.println("Please enter your age: ");
		age = s.nextInt();
		System.out.println("Please enter your address: ");
		address = s.next();
		s.close();
		
		System.out.println("Here is the information you provided:\nYour name is " + name + ", you are " + age
				+ " years old.\nYour address is\n" + address);

	}
}
