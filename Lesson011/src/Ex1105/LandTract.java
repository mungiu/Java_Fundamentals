package Ex1105;

public class LandTract
{
	LandTract()
	{
	}

	LandTract(double tractLength, double tractWidth)
	{
		this.tractLength = tractLength;
		this.tractWidth = tractWidth;
	}

	private double tractLength;
	private double tractWidth;

	// tractArea
	public double tractArea()
	{
		return tractLength * tractWidth;
	}

	// equals override
	public boolean equals(LandTract landTract)
	{
		return this.tractArea() == landTract.tractArea();
	}

	// toString override
	public String toString()
	{
		return "Tract area is: " + tractArea();
	}

	public double getTractLength()
	{
		return tractLength;
	}

	public double getTractWidth()
	{
		return tractWidth;
	}

	public void setTractLengeth(double tractLength)
	{
		this.tractLength = tractLength;
	}

	public void setTractWidth(double tractWidth)
	{
		this.tractWidth = tractWidth;
	}
}
