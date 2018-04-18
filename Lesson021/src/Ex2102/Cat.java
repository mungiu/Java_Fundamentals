package Ex2102;

public class Cat extends Pet
{
	private boolean isAHouseCat;

	public Cat(int age, String name, boolean isAHouseCat)
	{
		super(age, name);
		this.isAHouseCat = isAHouseCat;
	}

	public String speak()
	{
		return "miau";
	}
}
