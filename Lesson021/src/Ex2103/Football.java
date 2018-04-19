package Ex2103;

public class Football extends Ball
{
	private int diamater;
	private int suitableAge;

	public Football(int suitableAge, int diameter)
	{
		super(suitableAge, diameter);
	}

	@Override
	public String play()
	{
		return "Football playing";
	}

	@Override
	public int getDiameter()
	{
		return diamater;
	}
}
