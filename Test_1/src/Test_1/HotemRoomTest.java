package Test_1;

public class HotemRoomTest
{
	public static void main(String[] args)
	{
		HotelRoom room1 = new HotelRoom(1, 1000.00);
		HotelRoom room2 = new HotelRoom(2, 2000.00);
		HotelRoom room3 = new HotelRoom(3, 3000.00);

		room1.setRent(1001.00);

		Guest guest1 = new Guest("Abs");
		Guest guest2 = new Guest("Abcd");

		room1.checkIn(guest1);
		room2.checkIn(guest2);

		System.out.println(room1);
		System.out.println(room2);
		System.out.println(room3);
	}
}
