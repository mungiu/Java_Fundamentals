package Ex2103;

public class Lego extends Toy
{
	private int numberOfBriks;

	public Lego(int suitableAge, int numberOfBriks)
	{
		super(suitableAge);
		this.numberOfBriks = numberOfBriks;
	}

	public String play()
	{
		return "Lego Playing";
	}
}
