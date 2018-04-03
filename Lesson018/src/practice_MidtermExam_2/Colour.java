package practice_MidtermExam_2;

public class Colour
{
	private int red, green, blue;

	public Colour(int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public void set(int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed()
	{
		return red;
	}

	public int getGreen()
	{
		return green;
	}

	public int getBlue()
	{
		return blue;
	}

	public boolean isGray()
	{
		return (red == green && red == blue);
	}

	public void mixWith(Colour colour2)
	{
		red = (int) (red * 0.5 + colour2.red * 0.5);
		green = (int) (green * 0.5 + colour2.green * 0.5);
		blue = (int) (blue * 0.5 + colour2.blue * 0.5);
	}

	public Colour copy()
	{
		return new Colour(red, green, blue);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Colour))
			return false;
		else
		{
			Colour temp = (Colour) obj;

			return temp.red == red && temp.green == green && temp.blue == blue;
		}
	}

	@Override
	public String toString()
	{
		return "red " + red + " green " + green + " blue " + blue;
	}
}
