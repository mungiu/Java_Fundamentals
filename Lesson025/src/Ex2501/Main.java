package Ex2501;

public class Main
{
	public static void main(String[] args)
	{
		CarFileAdapter fileAdapter = new CarFileAdapter("test.bin");

		Owner mungiu = new Owner("Andrei", "Mungiu");
		Owner mungiu1 = new Owner("Vasile", "Mungiu");

		Car car1 = new Car("X1", "Ford", "Aerostoar", 1993, mungiu1);
		Car car2 = new Car("X2", "Mitsubishi", "Colt", 2011, mungiu);

		CarList carList = new CarList();

		carList.addCar(car1);
		carList.addCar(car2);

		fileAdapter.deleteCar(car1);

		fileAdapter.addCars(carList);

		fileAdapter.deleteCarByRegNumber("X2");
		
		fileAdapter.getAllCars("text.bin");
		
		System.out.println(fileAdapter.getAllCars("test.bin"));
	}
}
