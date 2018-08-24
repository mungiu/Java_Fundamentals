
public class PersonTest
{
	public static void main(String[] args)
	{
		Person test1 = new Person();

		test1.setBirthday("28.07.92");
		test1.setName("Simon Tirsgaard");

		System.out.println(test1.getName() + "\n" + test1.getBirthday());

	}
}
