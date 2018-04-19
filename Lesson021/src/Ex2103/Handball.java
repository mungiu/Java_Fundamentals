package Ex2103;

public class Handball extends Ball
{
	private int suitableAge;
	private int diameter;

	public Handball(int suitableAge, int diameter)
	{
		super(suitableAge, diameter);
	}

	public String play()
	{
		return "Handball playing";
	}

	@Override
	public int getDiameter()
	{
		return diameter;
	}
}
