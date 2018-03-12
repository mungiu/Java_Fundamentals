package Ex1403;

public class TestRoomCarpet
{
	public static void main(String[] args)
	{
		RoomDimension room1 = new RoomDimension(10, 10);
		RoomCarpet carpet1 = new RoomCarpet(room1, 100);

		System.out.println(carpet1.getTotalCost());
	}
}
