package practice_MidtermExam_2;

import java.util.ArrayList;

public class ColourPalette
{
	private int numberOfColours;
	ArrayList<Colour> colours;

	public ColourPalette(int maxNumberofColours)
	{
		numberOfColours = maxNumberofColours;
		colours = new ArrayList<Colour>(numberOfColours);
	}

	public int getNumberOfColours()
	{
		return numberOfColours;
	}

	public void add(Colour colour)
	{
		colours.add(colour);
	}

	public Colour get(int index)
	{
		return colours.get(index);
	}

	public int getNumberOfGrayColours()
	{
		int temp = 0;
		for (int i = 0; i < colours.size(); i++)
			if (colours.get(i).isGray())
				temp++;

		return temp;
	}

	public void mixColour(int index, Colour colour2)
	{
		colours.get(index).mixWith(colour2);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof ColourPalette))
			return false;
		else
		{
			ColourPalette temp = (ColourPalette) obj;

			return colours.equals(temp.colours);
		}
	}

	@Override
	public String toString()
	{
		return colours.toString();
	}
}
