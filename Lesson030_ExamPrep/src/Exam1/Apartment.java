package Exam1;

public class Apartment extends Residence
{
	private int numberOfRooms;

	public Apartment(int number, double size, int numberOfRooms)
	{
		super(number, size, null);
	}

	public int getNumberOfRooms()
	{
		return numberOfRooms;
	}
}
