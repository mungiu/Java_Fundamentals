package Ex2102;

public class Bee extends Animal
{
	private boolean isAHoneyBee;

	public Bee(int age, boolean isAHoneyBee)
	{
		super(age);
		this.isAHoneyBee = isAHoneyBee;
	}

	public String speak()
	{
		return "bzzz";
	}
}
