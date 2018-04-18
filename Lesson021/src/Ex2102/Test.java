package Ex2102;

public class Test
{
	public static void main(String[] args)
	{
		Animal[] animals = new Animal[4];
		animals[0] = new Frog(1, "green");
		animals[1] = new Dog(1, "Bari", "Sharpei");
		animals[2] = new Cat(1, "Marcel", true);
		animals[3] = new Bee(1, true);

		for (int i = 0; i < animals.length; i++)
			System.out.println(animals[i].speak());
	}
}
