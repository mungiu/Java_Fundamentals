package Ex1303;

public class TestGarage
{
	public static void main(String[] args)
	{
		Car car1 = new Car("Ford", "Aerostart", "Green", 1993);
		Car car2 = car1.copy();
		Car car3 = new Car("Mitsubishi", "Colt", "Grey", "MX 7407", 2013);

		Garage garage1 = new Garage();
		Garage garage2 = new Garage();
		Garage garage3 = new Garage();

		garage1.park(car1, 1);
		garage2.park(car2, 1);
		garage3.park(car3, 1);

		System.out.println(garage1.equals(garage2));
		System.out.println(garage2.equals(garage3));
	}
}
