package Test_1;

public class HotelRoom
{
	public HotelRoom(int roomNumber, double rent)
	{
		this.roomNumber = roomNumber;
		this.rent = rent;
		this.guest = null;
	}

	private int roomNumber;
	private double rent;
	Guest guest = new Guest("Allan");

	public int getRoomNumber()
	{
		return this.roomNumber;
	}

	public double getRent()
	{
		return this.rent;
	}

	public Guest getGuest()
	{
		return this.guest;
	}

	public void setRent(double rent)
	{
		this.rent = rent;
	}

	public boolean isAvailable()
	{
		if (this.guest == null)
			return true;
		else
			return false;
	}

	public void checkIn(Guest guest)
	{
		if (isAvailable())
			this.guest = guest;
	}

	public void checkOut()
	{
		this.guest = null;
	}

	@Override
	public String toString()
	{
		if (guest != null)
			return "Hotel room: " + roomNumber + ", rent: " + rent + ", Guest name: " + guest.GetName();
		else
			return "Hotel room: " + roomNumber + ", rent: " + rent;
	}
}
