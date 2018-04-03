package practice_MidtermExam_2;

public class ColourPaletteTest
{
	public static void main(String[] args)
	{
		ColourPalette pal1 = new ColourPalette(1);
		ColourPalette pal2 = new ColourPalette(2);

		Colour col1 = new Colour(10, 15, 25);
		Colour col2 = new Colour(15, 15, 15);

		pal1.add(col1);
		pal2.add(col2);

		System.out.println(pal1.equals(pal2));
	}
}
