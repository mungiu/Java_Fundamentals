package Exam1;

public class Room extends Residence
{
	public Room(int number, double size)
	{
		super(number, size, null);
	}

	public int getNumberOfRooms()
	{
		return super.getNumber();
	}
}
